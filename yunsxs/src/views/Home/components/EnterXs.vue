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
                <div>红色修水</div>
            </div>
            <div class="enterxs_right_items">
                <div class="">秋收起义在秋水</div>
                <div class="">修水革命史</div>
                <div class=""></div>
                <div class=""></div>
            </div>
            <div class="enterxs_travel"></div>
            <div class="enterxs_right_title">
                <div></div>
            </div>
            <div class="">
                <div class=""></div>
                <div class=""></div>
                <div class=""></div>
                <div class=""></div>
                <div class=""></div>
                <div class=""></div>
            </div>
        </div>
    </div>
</template>
<script>
export default {
    
}
</script>
<style>
.enterxs{width: 100%;}
.enterxs>div{float: left;}
.enter_info{width: 60%;}
.enter_info_content{width: 100%;}
.enter_info_text{
    width: 58%;
    height: 100%;
    float: right;
    position: relative;
    line-height: 25px;
}
.enter_info_text p{text-indent:2em;}
.enter_info_content_btn{
    position: relative;
    bottom: 0px;
}
.enter_info_content_btn>div{
    width: 19%;
    height: 40px;
    float: left;
    text-align: center;
    line-height: 40px;
    border: 1px solid white;
    color: blue;
    background-color:#eee;
}
.xuimg{
    width: 100%;
    display: flex;
    justify-content: space-around;
    margin-top: 10px;
}
.xuimg_item{
    width: 30%;
    height: 150px;
    position: relative;
}
.xuimg_item_a{
    width: 100%;
    height: 30px;
    position: absolute;
    bottom: 0px;
    z-index: 99;
    text-align: center;
    background-color: rgba(0,0,0,0.8); 
}
.xuimg_item_a a{
    text-decoration: none;
    color: white;
    line-height: 30px;
}
.enterxs_right{
    width: 35%;
    float: right!important;

}
.enterxs_right_title{
    width: 100%;
    height: 50px;
    background-color: #eee;

}
.enterxs_right_title>div{
    width: 50%;
    height: 100%;
    text-align: center;
    line-height: 50px;
    color: white;
}
.enterxs_right_title>div:first-child{
    background-color: blue;
}
.enterxs_right_items{
    width: 100%;
    display: flex;
    flex-wrap: wrap;
    justify-content: space-between;

}
.enterxs_right_items>div{
    width: 44%;
    height: 40px;
    border: 1px solid black;
    line-height: 40px;
    float: left;
    margin: 10px 0px;
}
.enterxs_travel{
    width: 100%;
    height: 80px;
    background-color: greenyellow;
}
</style>