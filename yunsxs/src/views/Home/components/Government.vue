<template>
    <div class="government">
       <div class="gover_swiper">
           <el-carousel height="400px">
                <el-carousel-item v-for="item in 4" :key="item">
                    <div style="background:red;width:100%;height:100%;"><h3 class="small">{{ item }}</h3></div>
                    
                </el-carousel-item>
            </el-carousel>
       </div>
       <div class="gover_swiper2">
           <el-carousel height="100px" direction="vertical" :autoplay="false">
                <el-carousel-item v-for="item in 3" :key="item">
                 <div style="background:red;width:100%;height:100%;"><h3 class="small">{{ item }}</h3></div>
                </el-carousel-item>
            </el-carousel>
            <div class="newList">
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
            {title:'就如何做好下一阶段改革工作，展开会议',time:'2020-03-05'}]

        }
    }
}
</script>
<style>
.government{
    width: 100%;
}
.government>div{float: left;}
.gover_swiper{width: 40%;}
.gover_swiper2{width:58%;margin-left: 2%;}
</style>