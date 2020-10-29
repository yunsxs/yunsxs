<template>
  <div class="user_bd">
    <div class="user_head">
      <div class="head_pic"></div>
      <div class="head_msg">
        <div class="head_name">{{ userInfo.username }}</div>
        <div class="head_divide"></div>
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
          <span class="user_change">点击进行个人信息修改</span>
          <i class="iconfont icon-xiugai edit" @click="showEdit"></i>
        </li>
      </ul>
    </div>
  </div>
</template>
<script>
export default {
  created() {
    this.userId = window.sessionStorage.getItem('userId')
    this.getUserInfo()
  },
  data() {
    return {
      prevUserPhone: '',
      userInfoStr: '',
      userInfo: {},
      userId: '',
      isEdit: false,
    }
  },
  methods: {
    async getUserInfo() {
      const { data: res } = await this.$http.get('/user/getUser', {
        params: {
          id: this.userId,
        },
      })
      this.userInfo = res.data
      this.userInfoStr = JSON.stringify(res.data)
      this.prevUserPhone = res.data.phonenumber
    },
    async showEdit() {
      this.isEdit = !this.isEdit
      if (!this.isEdit) {
        let isChanged =
          JSON.stringify(this.userInfo) === this.userInfoStr ? false : true
        // console.log(this.prevUserPhone)
        // 开始修改
        if (!isChanged) return
        let userInfo = {}
        if (this.prevUserPhone === this.userInfo.phonenumber) {
          // 电话未修改
          userInfo = {
            userid: this.userInfo.userid,
            userrname: this.userInfo.userrname,
          }
        } else {
          userInfo = {
            userid: this.userInfo.userid,
            userrname: this.userInfo.userrname,
            phonenumber: this.userInfo.phonenumber,
          }
        }
        const { data: res } = await this.$http.post('user/update', userInfo)
        if (res.code !== 200) {
          this.$message.error(res.message)
          this.getUserInfo()
          return;
        }
        this.$message.success('更新成功')
        this.getUserInfo()
      }
    },
  },
}
</script>
<style scoped>
@import url('../../../assets/font-icon/iconfont.css');

.user_head {
  height: 200px;
  width: 1000px;
  /* background-color: blue; */
  margin: auto;
}
.user_head .head_pic {
  float: left;
  width: 200px;
  height: 200px;
  border-radius: 100px;
  background-image: url('../images/user01.jpg');
  background-repeat: no-repeat;
  background-position: center;
  background-size: cover;
}
.user_head .head_msg {
  position: relative;
  float: left;
  width: 700px;
  height: 200px;
  /* background-color: pink; */
  margin: 0 50px;
}
.user_head .head_name {
  width: 700px;
  height: 160px;
  color: #ccc;
  font-size: 30px;
  line-height: 160px;
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
.edit {
  color: pink;
  font-size: 25px;
  vertical-align: middle;
  cursor: pointer;
}
.user_imf .user_change {
  font-size: 15px;
  color: red;
}
</style>