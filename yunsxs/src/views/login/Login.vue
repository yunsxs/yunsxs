<template>
  <div class="login_content">
    <div class="bg" :class="{ bg_blur: isBlur }" id="bg"></div>
    <div class="login-box">
      <div class="login_title"></div>
      <el-form
        ref="loginFormRef"
        :model="loginForm"
        :rules="loginFormRule"
        class="login-msg"
      >
        <el-form-item prop="username">
          <el-input
            type="text"
            placeholder="请输入用户名"
            v-model="loginForm.username"
            @focus="changeBlur"
            @blur="changeFocus"
          ></el-input>
        </el-form-item>
        <el-form-item prop="password">
          <el-input
            :type="type"
            placeholder="请输入密码"
            v-model="loginForm.password"
            @focus="changeBlur"
            @blur="changeFocus"
          >
            <i
              class="iconfont el-input__icon pwd_icon"
              :class="[isActive ? 'icon-Notvisible' : 'icon-browse']"
              slot="suffix"
              @click="handleIconClick"
            ></i>
          </el-input>
        </el-form-item>
        <el-form-item class="btns">
          <!-- <div class="login-submit">
            <button class="login-btn">登录</button>
            <button class="login-btn register">注册</button>
          </div>-->
          <el-button type="primary" @click="handleLogin">登录</el-button>
          <el-button @click="handleRegister">注册</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
export default {
  created() {
    let that = this
    document.onkeypress = function (e) {
      var keycode = document.all ? event.keyCode : e.which
      if (keycode == 13) {
        that.handleLogin() // 登录方法名
        return false
      }
    }
  },
  data() {
    return {
      isBlur: false,
      loginForm: {
        username: '',
        password: '',
      },
      type: 'password',
      loginFormRule: {
        username: [
          { required: true, message: '请输入用户名', trigger: 'blur' },
        ],
        password: [{ required: true, message: '请输入密码', trigger: 'blur' }],
      },
      isActive: true,
    }
  },
  methods: {
    changeBlur() {
      this.isBlur = true
    },
    changeFocus() {
      this.isBlur = false
    },
    handleIconClick() {
      this.type = 'password' === this.type ? 'text' : 'password'
      this.isActive = !this.isActive
    },
    handleRegister() {
      this.$router.push('/register')
    },
    handleLogin() {
      this.$refs.loginFormRef.validate(async (valid) => {
        if (!valid) return
        const { data: res } = await this.$http.post('login', this.loginForm)
        if (res.code !== 200) return this.$message.error('用户名或者密码错误')
        this.$message.success('登录成功')
        window.sessionStorage.setItem('username', res.data.username)
        this.$router.push('/home')
      })
    },
  },
}
</script>

<style scoped>
@import url('../../assets/font-icon/iconfont.css');

.bg {
  width: 100%;
  height: 100vh;
  transition: all 0.5s;
  background: url('./images/bg05.jpg') no-repeat center;
  background-size: cover;
}

.bg_blur {
  filter: blur(1px);
  -webkit-filter: blur(5px);
}

.login-box {
  position: absolute;
  top: 50%;
  left: 50%;
  width: 400px;
  height: 300px;
  border: 1px solid #ccc;
  transform: translate(-50%, -50%);
  border-radius: 10px;
  box-shadow: 0 0 15px rgba(0, 0, 0, 0.3);
  /* background-color: rgba(91, 184, 228, 0.7); */
  background-color: rgba(0, 0, 0, 0.5);
}

.login-msg {
  box-sizing: border-box;
  padding: 0 70px;
  color: #fff;
  margin-top: 70px;
}

.pwd_icon {
  cursor: pointer;
  font-size: 24px;
  color: #ccc;
}

.btns {
  margin-top: 30px;
}

.el-button {
  width: 120px;
}

.el-button:first-child {
  margin-right: 4px;
}
</style>
