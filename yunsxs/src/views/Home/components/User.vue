<template>
  <div class="user_bd">
    <div class="user_head">
      <div class="head_pic"></div>
      <div class="head_msg">
        <div class="head_name">用户昵称名</div>
        <div class="head_divide"></div>
      </div>
    </div>
    <div class="user_body">
      <ul class="user_imf">
        <li>用户ID:</li>
        <li>
          用户真实姓名:
          <span v-show="!isEdit">{{userInfo.username}}</span>
          <input v-show="isEdit" v-model="userInfo.username" />
          <!-- <i class="iconfont icon-xiugai edit" @click="showEdit"></i> -->
        </li>
        <li>
          用户电话号码:
          <span v-show="!isEdit">{{userInfo.phoneNumber}}</span>
          <input v-show="isEdit" v-model="userInfo.phoneNumber" />
          <!-- <i class="iconfont icon-xiugai edit" @click="showEdit"></i> -->
        </li>
        <li>
          用户等级:
        </li>
        <li>
          用户积分:
        </li>
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
  data() {
    return {
      userInfo: {
        username: 'wanxeuhua',
        phoneNumber: '11111'
      },
      isEdit: false
    }
  },
  methods: {
    showEdit() {
      this.isEdit = !this.isEdit
    }
  }
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
.user_imf .user_change{
    font-size: 15px;
    color: red;
}
</style>