<template>
  <div class="register_content">
    <div class="logo">
      <img src="./images/logo.jpg" alt />
      <span class="title">云上修水</span>
    </div>
    <div class="register_box">
      <div class="register_title">
        <h2>注册</h2>
      </div>
      <el-form
        :model="registerForm"
        ref="registerFormRef"
        :rules="registerFormRules"
        class="register_form"
      >
        <el-form-item prop="username">
          <el-input v-model="registerForm.username" prefix-icon="el-icon-user"></el-input>
        </el-form-item>
        <el-form-item prop="password">
          <el-input prefix-icon="el-icon-lock" v-model="registerForm.password"></el-input>
        </el-form-item>
        <el-form-item prop="phoneNumber">
          <el-input prefix-icon="el-icon-phone" v-model="registerForm.phoneNumber"></el-input>
        </el-form-item>
        <el-form-item prop="check">
          <div class="check">
            <div class="tiao" @mousedown="handledrag" :style="{left: dragLeft+'px'}">
              <div class="success">完成验证</div>
              <div class="drag">
                <i class="el-icon-arrow-right"></i>
              </div>
            </div>
            <span>请拖至最右边完成验证</span>
          </div>
        </el-form-item>
        <el-form-item class="btns">
          <el-button type="primary" :disabled="btnDisable" @click="register">注册并登录</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      registerForm: {
        username: '',
        password: '',
        phoneNumber: ''
      },
      registerFormRules: {
        username: [
          { required: true, message: '请输入用户名', trigger: 'blur' }
        ],
        password: [{ required: true, message: '请输入密码', trigger: 'blur' }],
        phoneNumber: [
          { required: true, message: '请输入电话号码', trigger: 'blur' }
        ]
      },
      dragLeft: -272
    }
  },
  methods: {
    handledrag(e) {
      let _this = this
      let box = document.querySelector('.register_box')
      let disX = box.offsetLeft - parseInt(getComputedStyle(box).width) / 2
      let b = document.querySelector('.check').offsetLeft
      document.onmousemove = function(e) {
        if (_this.dragLeft < 0) {
          _this.dragLeft = e.clientX - disX - 350
          if (_this.dragLeft < -272) {
            _this.dragLeft = -272
          }
          if (_this.dragLeft > 0) {
            _this.dragLeft = 0
          }
        }
      }
      document.onmouseup = function() {
        document.onmousemove = null
        document.onmouseup = null
        if (_this.dragLeft < 0) {
          _this.dragLeft = -272
        }
      }
    },
    register() {
      this.$refs.registerFormRef.validate(valid => {
        if (valid) {
          if (this.dragLeft !== 0) {
            alert('请先完成验证')
          }
        }
      })
    }
  },
  computed: {
    btnDisable() {
      if (this.dragLeft === 0) {
        return false
      }
      return true
    }
  }
}
</script>

<style scoped>
.register_content {
  height: 100vh;
  background-repeat: no-repeat;
  background-size: contain;
  background-position: center;
  position: relative;
}

.logo {
  position: absolute;
  top: 5%;
  left: 5%;
}

.logo .title {
  /* line-height: 130px; */
  font-size: 40px;
  text-shadow: 5px 5px 7px #696565, 0px 0px 2px black;
  color: #409EFF;
  vertical-align: middle;
  /* font-style: italic; */
}

.logo img {
  width: 80px;
  vertical-align: middle;
}

.register_box {
  width: 400px;
  height: 450px;
  box-shadow: 0 0 15px rgba(0, 0, 0, 0.5);
  border-radius: 5px;

  background: url('./images/bg04.jpg') no-repeat;
  background-size: cover;
  background-position: 0px;

  position: absolute;
  left: 50%;
  top: 50%;
  transform: translate(-50%, -50%);

  animation: movebg 100s infinite linear;
}

@keyframes movebg {
  0% {
    background-position: 0px;
  }
  40% {
    background-position: 100%;
  }
  50% {
    background-position: 100%;
  }
  90% {
    background-position: 0px;
  }
  100% {
    background-position: 0px;
  }
}

.register_title {
  text-align: center;
  margin: 30px auto;
  position: relative;
}

.register_title::before {
  content: '';
  position: absolute;
  left: 10%;
  top: 50%;
  width: 120px;
  height: 1px;
  transform: scaleY(0.5);
  background-color: black;
}

.register_title::after {
  content: '';
  position: absolute;
  right: 10%;
  top: 50%;
  width: 120px;
  height: 1px;
  transform: scaleY(0.5);
  background-color: black;
}

.register_form {
  box-sizing: border-box;
  padding: 0 40px;
  width: 100%;

  position: absolute;
  top: 55%;
  left: 50%;
  transform: translate(-50%, -50%);
}

.check {
  width: 320px;
  height: 40px;
  border: 1px solid #ccc;
  text-align: center;
  position: relative;
  color: #000000;
  background-color: white;
  overflow: hidden;
}

.tiao {
  width: 100%;
  height: 100%;
  position: absolute;
}

.tiao .success {
  float: left;
  background-color: #67c23a;
  width: 270px;
  height: 100%;
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
}

.tiao .drag {
  float: left;
  background-color: #ccc;
  width: 50px;
  height: 40px;
  cursor: pointer;
}

.btns .el-button {
  width: 150px;
}

span {
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
}
</style>
