<template>
    <div class="government">
       <div class="gover_swiper">
           <el-carousel height="400px">
                <el-carousel-item v-for="item in swiper" :key="item">
                    <el-image
                    style="width: 100%; height: 100%"
                    :src="item"
                    fit="fill"></el-image>
                </el-carousel-item>
            </el-carousel>
       </div>
       <div class="gover_swiper2">
           <el-carousel height="100px" direction="vertical" >
                <el-carousel-item v-for="item in topImg" :key="item">
                 <el-image
                    style="width: 100%; height: 100%"
                    :src="item"
                    fit="fill"></el-image>
                </el-carousel-item>
            </el-carousel>
            <div class="newList">
               <div class="newtap"><span>政务资讯</span></div>
               <hr/>
               <List :news="news"></List>
            </div>
       </div>
    </div>
</template>
<script>
import List from '../../../components/list/list'
export default {
    components:{
        List
    },
    data(){
        return{
            news:[{title:'就如何做好下一阶段改革工作，展开会议',time:'2020-03-05'},
            {title:'就如何做好下一阶段改革工作，展开会议',time:'2020-03-05'},
            {title:'就如何做好下一阶段改革工作，展开会议',time:'2020-03-05'},
            {title:'就如何做好下一阶段改革工作，展开会议',time:'2020-03-05'},
            {title:'就如何做好下一阶段改革工作，展开会议',time:'2020-03-05'},
            {title:'就如何做好下一阶段改革工作，展开会议',time:'2020-03-05'},
            {title:'就如何做好下一阶段改革工作，展开会议',time:'2020-03-05'}],
            topImg:[require('../../../assets/imgs/h1.jpg'),require('../../../assets/imgs/h2.jpg'),require('../../../assets/imgs/h3.jpg')],
            swiper:[require('../../../assets/imgs/home1.jpg'),require('../../../assets/imgs/home2.jpg'),require('../../../assets/imgs/home3.jpg'),require('../../../assets/imgs/home4.jpg')]

        }
    }
}
</script>
<style>
.government{
    width: 100%;
    margin-bottom: 50px;
}
.government>div{float: left;}
.gover_swiper{width: 40%;}
.gover_swiper2{width:58%;margin-left: 2%;}
.newtap{
    width: 150px;
    height: 40px;
    font-size: 20px;
    font-weight: bold;
    color: white;
    text-align: center;
    line-height: 40px;
    margin: 10px 0px ;
    background: url('../../../assets/imgs/title.png') no-repeat;
    background-size: 100% 100%;
}
</style>