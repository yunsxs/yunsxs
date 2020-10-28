<template>
  <div class="home">
    <div class="nav topNav" :class="{ topbg1: topBg }">
      <div class="nav_list">
        <ul>
          <li>
            <a href="#">
              <i class="el-icon-star-off"></i>
              <span>积分管理</span>
            </a>
          </li>
          <li>
            <a href="#">
              <i class="el-icon-s-claim"></i>
              <span>签到查询</span>
            </a>
          </li>
          <li>
            <a href="#">
              <i class="el-icon-medal"></i>
              <span>等级查询</span>
            </a>
          </li>
          <li>
            <a href="#" @click.prevent="logOut">
              <i class="iconfont icon-tuichudenglu"></i>
              <span>登出</span>
            </a>
          </li>
        </ul>
      </div>
    </div>
    <div class="home_block logo">
      <el-image
        style="width: 200px; height: 100px"
        :src="require('@/assets/imgs/logo.png')"
        fit="fit"
      ></el-image>
    </div>
    <div class="home_block nav secondNav">
      <ul>
        <li @click.prevent="jumpTo('/government')">
          <a href="#">
            <i class="iconfont icon-icon05"></i>
            <span>政务资讯</span>
          </a>
        </li>
        <li @click.prevent="jumpTo('/enterxs')">
          <a href="#">
            <i class="iconfont icon-shui"></i>
            <span>走进修水</span>
          </a>
        </li>
        <li @click.prevent="jumpTo('/travel')">
          <a href="#">
            <i class="iconfont icon-lvyou1"></i>
            <span>旅游度假</span>
          </a>
        </li>
        <li @click.prevent="jumpTo('/photograph')">
          <a href="#">
            <i class="iconfont icon-zhaopianpaizhao"></i>
            <span>随手拍</span>
          </a>
        </li>
        <li @click.prevent="jumpTo('/videoNews')">
          <a href="#">
            <i class="iconfont icon-shipinxinwen"></i>
            <span>视频新闻</span>
          </a>
        </li>
        <li @click.prevent="jumpTo('/user')">
          <a href="#">
            <i class="iconfont icon-gerenxinxi-copy"></i>
            <span>个人信息</span>
          </a>
        </li>
      </ul>
    </div>
    <div class="home_block home_content">
      <div class="home_main">
        <router-view></router-view>
      </div>
    </div>
    <div class="home_footer">
      <div class="home_footer_content">
        <el-image
          :src="require('@/assets/imgs/dzjgicon.png')"
          fit="fit"
        ></el-image>
        <div class="home_footer_text">
          <div>
            <span>主办：中共修水县委 修水县人民政府</span>
            <span>承办：修水县政府信息化工作办公室</span>
          </div>
          <div>
            <span>政府网站标识码：3604240020</span>
            <span>ICP备案编号 赣ICP备05004636号</span>
            <span>赣公网安备36042502000101</span>
            <span>联系电话：0792-7221108</span>
            <span>邮箱：xsxxb@163.com</span>
          </div>
        </div>
        <div>
          <el-image
            style="width: 40px; height: 40px"
            :src="require('@/assets/imgs/gaicon.png')"
            fit="fit"
          ></el-image>
          <el-image
            style="width: 70px; height: 40px"
            :src="require('@/assets/imgs/icon-footer2.png')"
            fit="fit"
          ></el-image>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  created() {
    if(!window.sessionStorage.getItem('userInfo')){
      this.$router.push('/login')
    }
  },
  data() {
    return {
      topBg: false, //导航栏class控制
    }
  },
  mounted() {
    document.addEventListener('scroll', this.scrollMeth)
  },
  methods: {
    jumpTo(to) {
      this.$router.push(to)
    },
    scrollMeth() {
      //导航栏滚动监听事件
      if (document.documentElement.scrollTop > 20) {
        this.topBg = true
      }
      if (document.documentElement.scrollTop < 20) {
        this.topBg = false
      }
    },
    logOut() {
      window.sessionStorage.clear()
      this.$router.push('/login')
    },
  },
}
</script>
<style scoped>
.nav ul li:hover span {
  color: red;
}
</style>