<template>
    <div class="enterxs">
        <div class="enter_info">
           <div class="newtap"><span>修水概况</span></div>
           <div class="enter_info_content">
               <el-image
                    style="width: 40%; "
                    :src="require('../../../assets/imgs/xuinfo.jpg')"
                    fit="fill"></el-image>
                <div class="enter_info_text">
                    <p>修水县位于赣西北修河上游，居湘、鄂、赣三省九县中心，辖19镇17乡，面积4502.46平方公里，人口87万，是江西省面积最大和九江市人口最多的县，也是国家扶贫开发工作重点县和省定特困片区县。一是红色摇篮。修水是著名的革命老区，是秋收起义的重要策源地，工农革命军第一面军旗在这里设计、制作并率先升起，工农革命军第</p>
                    <div class="enter_info_content_btn">
                       <div>历史沿革</div>
                       <div>行政区划</div>
                       <div>社会发展</div>
                       <div>经济发展</div>
                       <div>自然资源</div>
                       <div>地理交通</div>
                       <div>乡镇风采</div>
                       <div>修水县志</div>
                       <div>修水荣誉</div>
                    </div>
                </div>
           </div>
           <div class="xuimg">
               <div class="xuimg_item">
                   <el-image
                    style="width: 100%; height: 150px;"
                    :src="require('../../../assets/imgs/l1.jpg')"
                    fit="fill"></el-image>
                    <div class="xuimg_item_a">
                       <a href="#">城南市民广场</a>
                    </div>
               </div>
                <div class="xuimg_item">
                   <el-image
                    style="width: 100%;height: 150px; "
                    :src="require('../../../assets/imgs/l2.jpg')"
                    fit="fill"></el-image>
                    <div class="xuimg_item_a">
                       <a href="#">陈家大屋嵌碧海</a>
                    </div>
               </div>
               <div class="xuimg_item">
                   <el-image
                    style="width: 100%;height: 150px; "
                    :src="require('../../../assets/imgs/l3.jpg')"
                    fit="fill"></el-image>
                    <div class="xuimg_item_a">
                       <a href="#">哺</a>
                    </div>
               </div>
           </div>
        </div>
        <div class="enterxs_right">
            <div class="enterxs_right_title">
                <div :class="{enter_info_active:info}" @mouseenter="mouse(true)">红色修水</div>
                <div :class="{enter_info_active:!info}" @mouseenter="mouse(false)">人文修水</div>
            </div>
            <div class="enterxs_right_items" v-if="info">
                <div class="tag1">
                    <div class="enter_info_btn_tag ">
                        <i class="iconfont icon-changcheng"></i>
                    </div>
                    <span>秋收起义在秋水</span>
                </div>
                <div class="tag2">
                    <div class="enter_info_btn_tag ">
                        <i class="iconfont icon-lishi"></i>
                    </div>
                    <span>修水革命史</span>
                </div>
                <div class="tag3">
                    <div class="enter_info_btn_tag">
                        <i class="iconfont icon-gerenxinxi-copy"></i>
                    </div>
                    <span>修水先烈</span>
                </div>
                <div class="tag4">
                    <div class="enter_info_btn_tag">
                        <i class="iconfont icon-lvyou"></i>
                    </div>
                    <span>革命遗址</span>
                </div>
            </div>
            <div class="enterxs_right_items" v-else>
                <div class="tag1">
                    <div class="enter_info_btn_tag ">
                        <i class="iconfont icon-changcheng"></i>
                    </div>
                    <span>修水名人</span>
                </div>
                <div class="tag2">
                    <div class="enter_info_btn_tag ">
                        <i class="iconfont icon-lishi"></i>
                    </div>
                    <span>风土人情</span>
                </div>
                <div class="tag3">
                    <div class="enter_info_btn_tag">
                        <i class="iconfont icon-gerenxinxi-copy"></i>
                    </div>
                    <span>非物质文化遗产</span>
                </div>
            </div>
            <div class="enterxs_travel">
                <i class="iconfont icon-lvyou2"></i>
                <span>旅游修水</span>
            </div>
            <div class="enterxs_right_title">
                <div class="enter_info_active">投资修水</div>
            </div>
            <div class="enterxs_list">
                <div><i class="iconfont icon-yitouzipingtai"></i>投资平台</div>
                <div><i class="iconfont icon-touzizhengce"></i>投资政策</div>
                <div><i class="iconfont icon-touzizhinan"></i>投资指南</div>
                <div><i class="iconfont icon-touzichengbendi" style="font-size: 40px;"></i>投资成本</div>
                <div><i class="iconfont icon-zhaoshang-"></i>网上招商</div>
                <div><i class="iconfont icon-building"></i>知名企业</div>
            </div>
        </div>
    </div>
</template>
<script>
export default {
    data(){
        return{
            info:true
        }
    },
    methods:{
        mouse(flag){
           console.log("---------entered")
           this.info=flag;
        }
    }
    
}
</script>
<style>
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
.tag1>div{background-color:rgb(239,187,132);}
.tag1:hover{background-color:rgb(239,187,132);color: white;}
.tag2>div{background-color:rgb(135,192,226);}
.tag2:hover{background-color:rgb(135,192,226);color: white;}
.tag3>div{background-color:rgb(140,202,207);}
.tag3:hover{background-color:rgb(140,202,207);color: white;}
.tag4>div{background-color:rgb(237,151,142);}
.tag4:hover{background-color:rgb(237,151,142);color: white;}
</style>