<template>
  <div class="user_bd">
    <div class="user_head">
      <div class="head_pic"></div>
      <div class="head_msg">
        <div class="head_name">{{ userInfo.username }}</div>
        <!-- <div class="head_divide"></div> -->
        <div class="level">
          <el-progress
            :text-inside="false"
            :stroke-width="25"
            :percentage="12.5 + (userInfo.userscore / this.level_max * 100)*0.875"
          ></el-progress>
          <span class="level_span">Lv{{userInfo.userlevel}}</span>
          <span class="level_score">{{userInfo.userscore}} / {{this.level_max}}</span>
        </div>
      </div>
    </div>
    <div class="user_body">
      <ul class="user_imf">
        <li>用户ID: {{ userInfo.userid }}</li>
        <li>
          用户真实姓名:
          <span v-show="!isEdit">{{ userInfo.userrname }}</span>
          <input v-show="isEdit" v-model="userInfo.userrname" />
          <!-- <i class="iconfont icon-xiugai edit" @click="showEdit"></i> -->
        </li>
        <li>
          用户电话号码:
          <span v-show="!isEdit">{{ userInfo.phonenumber }}</span>
          <input v-show="isEdit" v-model="userInfo.phonenumber" />
          <!-- <i class="iconfont icon-xiugai edit" @click="showEdit"></i> -->
        </li>
        <li>用户等级: {{ userInfo.userlevel }}</li>
        <li>用户积分: {{ userInfo.userscore }}</li>
        <li>
          <span @click="showEdit" style="cursor: pointer;">
            <span class="user_change">点击进行个人信息修改</span>
            <i class="iconfont icon-xiugai edit"></i>
          </span>
        </li>
      </ul>
    </div>
  </div>
</template>
<script>
export default {
  created() {
    this.userId = window.sessionStorage.getItem('userId');
    this.getUserInfo();
  },
  data() {
    return {
      prevUserPhone: '',
      userInfoStr: '',
      userInfo: {},
      userId: '',
      isEdit: false,
      level_max: 0
    };
  },
  methods: {
    async getUserInfo() {
      const { data: res } = await this.$http.get('/user/getUser', {
        params: {
          id: this.userId
        }
      });
      this.userInfo = res.data;
      this.userInfoStr = JSON.stringify(res.data);
      this.prevUserPhone = res.data.phonenumber;
      switch (this.userInfo.userlevel) {
        case 1:
          this.level_max = 300;
          break;
        case 2:
          this.level_max = 800;
          break;
        case 3:
          this.level_max = 1500;
          break;
        case 4:
          this.level_max = 2500;
          break;
        case 5:
          this.level_max = 9999;
      }
    },
    async showEdit() {
      this.isEdit = !this.isEdit;
      if (!this.isEdit) {
        let isChanged =
          JSON.stringify(this.userInfo) === this.userInfoStr ? false : true;
        // console.log(this.prevUserPhone)
        // 开始修改
        if (!isChanged) return;
        let userInfo = {};
        if (this.prevUserPhone === this.userInfo.phonenumber) {
          // 电话未修改
          userInfo = {
            userid: this.userInfo.userid,
            userrname: this.userInfo.userrname
          };
        } else {
          userInfo = {
            userid: this.userInfo.userid,
            userrname: this.userInfo.userrname,
            phonenumber: this.userInfo.phonenumber
          };
        }
        const { data: res } = await this.$http.post('user/update', userInfo);
        if (res.code !== 200) {
          this.$message.error(res.message);
          this.getUserInfo();
          return;
        }
        this.$message.success('更新成功');
        this.getUserInfo();
      }
    }
  }
};
</script>
<style scoped>
@import url('../../../assets/font-icon/iconfont.css');

.user_head {
  height: 150px;
  width: 1000px;
  /* background-color: blue; */
  margin: auto;
  position: relative;
}
.user_head .head_pic {
  float: left;
  width: 100px;
  height: 100px;
  border-radius: 50px;
  background-image: url('https://cube.elemecdn.com/0/88/03b0d39583f48206768a7534e55bcpng.png');
  background-repeat: no-repeat;
  background-position: center;
  background-size: cover;
  border: 1px solid #ccc;
  /* position: absolute; */
}
.user_head .head_msg {
  position: relative;
  float: left;
  width: 700px;
  height: 100px;
  /* background-color: pink; */
  margin: 0 25px;
}
.user_head .head_name {
  width: 700px;
  /* height: 100px; */
  color: rgb(251, 114, 153);
  font-size: 30px;
  line-height: 60px;
}
.user_head .head_divide {
  position: absolute;
  width: 700px;
  height: 2px;
  background-color: #ccc;
}
.user_bd .user_body {
  width: 1000px;
  height: 270px;
  /* background-color: pink; */
  margin: auto;
  border-bottom: 1px solid #ccc;
}
.user_body .user_imf li {
  list-style: none;
  font-size: 18px;
  padding: 10px;
}

.user_imf li:nth-child(even) {
  /* background-color: rgb(242, 243, 246); */
}

.user_imf input {
  width: 200px;
  height: 20px;
  padding: 3px 5px 0px;
  border-radius: 3px;
  font-size: 18px;
  vertical-align: middle;
  border: 1px solid #000000;
}

.edit {
  color: rgb(251, 114, 153);
  font-size: 25px;
  vertical-align: middle;
  cursor: pointer;
}
.user_imf .user_change {
  font-size: 15px;
  color: rgb(251, 114, 153);
}
.level {
  position: relative;
}

.level_span {
  position: absolute;
  top: 50%;
  transform: translateY(-50%);
  left: 1%;
  color: #ffffff;
  line-height: 25px;
  font-size: 14px;
  font-weight: 600;
}

.level_span::before {
  content: '';
  display: inline-block;
  position: absolute;
  width: 0;
  height: 0;
  border-top: 6px solid #ffffff;
  border-left: 6px solid transparent;
  border-right: 6px solid transparent;
  border-bottom: 6px solid transparent;
  z-index: 2;
  left: 100%;
}
.level_span::after {
  content: '';
  display: inline-block;
  position: absolute;
  width: 0;
  height: 0;
  border-bottom: 6px solid #ffffff;
  border-left: 6px solid transparent;
  border-right: 6px solid transparent;
  border-top: 6px solid transparent;
  z-index: 2;
  left: 100%;
  bottom: -1px;
}

.level_score {
  position: absolute;
  left: 44%;
  top: 50%;
  transform: translateY(-50%);
}
</style>