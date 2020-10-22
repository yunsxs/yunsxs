<template>
    <div class="home">
        <div class="nav topNav" :class="{topbg1:topBg}">
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
                        <a href="#">
                            <i class="el-icon-s-claim"></i>
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
            fit="fit"></el-image> 
        </div>
        <div class="home_block nav secondNav">
            <ul>
                <li>
                    <a href="#">
                        <i class=""></i>
                        <span>政务资讯</span>
                    </a>
                </li>
                 <li>
                    <a href="#">
                        <i class=""></i>
                        <span>走进修水</span>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <i class=""></i>
                        <span>旅游度假</span>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <i class=""></i>
                        <span>随手拍</span>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <i class=""></i>
                        <span>视频新闻</span>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <i class=""></i>
                        <span>个人信息</span>
                    </a>
                </li>
            </ul>
        </div>
        <div class="home_block home_content">
           <div class="home_main">
              <EnterXs></EnterXs>
           </div>
        </div>
        <div class="home_footer">
            <div class="home_footer_content">
                <el-image
                :src="require('@/assets/imgs/dzjgicon.png')"
                fit="fit"></el-image>
                <div class="home_footer_text">
                    <div>
                        <span>主办：中共修水县委  修水县人民政府</span>
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
                <el-image
                style="width: 40px; height: 40px"
                :src="require('@/assets/imgs/gaicon.png')"
                fit="fit"></el-image>
                <el-image
                style="width: 70px; height: 40px"
                :src="require('@/assets/imgs/icon-footer2.png')"
                fit="fit"></el-image>
            </div>
        </div>
    </div>
</template>
<script>
import Governament from './components/Government'
import EnterXs from './components/EnterXs'
export default {
    components:{
        Governament,
        EnterXs
    },
    data() {
        return{
            topBg:true
        }
    },
    mounted(){
       document.addEventListener("scroll",this.scrollMeth)
    },
    methods:{
        scrollMeth(){
            
            if(document.documentElement.scrollTop>20){
                this.topBg=false;
            }
            if(document.documentElement.scrollTop<20){
                this.topBg=true
            }
        }
    }
    
}
</script>
<style>

</style>