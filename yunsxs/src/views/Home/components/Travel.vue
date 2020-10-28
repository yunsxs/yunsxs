<template>
    <div class="travel_bd">
        <div class="travel_mes">
            <div class="travel_person">
                <div class="travel_title">领导之窗</div>
                <div class="travel_photo">
                    <img src="../images/per01.jpg" alt="">
                </div>
                <div class="travel_pname">
                    <h3 class="text">孙朝辉</h3>
                    <span>县委书记</span>
                </div>
            </div>
            <div class="travel_pic">
                <img src="../images/bg02.jpg" alt="">
            </div>
            <div class="travel_text">
                <h2>美丽家乡修水</h2>
                <a href="#">历史悠久的修水，山川深重，钟秀居多，古老建筑星罗棋布，民俗文化博大精深。这里，有五千年的山背文化，有商代的古艾文明，有始自东汉的军事文化、东晋的道教文化、唐代的佛教文化，有源远流长的姓氏文化、客家文化。</a>
            </div>
        </div>
        <div class="travel_mes">
            <div class="travel_person">
                <div class="travel_title">领导之窗</div>
                <div class="travel_photo">
                    <img src="../images/per02.jpg" alt="">
                </div>
                <div class="travel_pname">
                    <h3 class="text">张  林</h3>
                    <span>县委副书记、县长</span>
                </div>
            </div>
            <div class="travel_text">
                <h2>桃里陈氏故居与五杰广场</h2>
                <a href="#">传承：陈氏故居：修水桃里是清末两代名人陈宝箴、陈三立父子的诞生。还有修水杭猪、修水宁红茶、修水赭砚、西港化红、修水青钱降糖神茶、黄坳西瓜、淮山板鸭、古市花椒等小吃。</a>
            </div>
            <div class="travel_pic travel_pic2">
                <img src="../images/bg03.jpg" alt="">
            </div>
        </div>
        <div class="travel_mes">
            <div class="travel_person">
                <div class="travel_title">领导之窗</div>
                <div class="travel_photo">
                    <img src="../images/per01.jpg" alt="">
                </div>
                <div class="travel_pname">
                    <h3 class="text">孙朝辉</h3>
                    <span>县委书记</span>
                </div>
            </div>
            <div class="travel_pic">
                <img src="../images/bg04.jpg" alt="">
            </div>
            <div class="travel_text">
                <h2>千年古镇</h2>
                <a href="#">渣津镇，商周时期开始建城，古称艾侯国，是古艾文化策源地 、佛教文化发祥地、中共苏区根据地。渣津是宗教圣地。早在晋代有吴猛和许逊，炼丹于黄龙山及龙安山， 为民除害，追赶孽龙，留有许多故事传说。</a>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    
}
</script>

<style scoped>
.travel_bd .travel_mes {
    width: 100%;
    height: 160px;
    position: relative;
}

.travel_mes .travel_pic {
    display: inline-block;
    width: 340px;
    height: 160px;
}

.travel_pic img {
    width: 340px;
    height: 160px;
}

.travel_text {
    display: inline-block;
    position: absolute;
    width: 480px;
}

.travel_text h2 {
    padding: 10px;
}

.travel_text a {
    display: inline-block;
    padding: 10px;
    color: #000;
}

.travel_pic2 {
    float: right;
}

.travel_mes .travel_person {
    float: left;
    width: 250px;
    height: 160px;
    background-color: rgb(242,243,246);
    margin-right: 50px;
}

.travel_person .travel_title {
    width: 120px;
    height: 25px;
    background-color: skyblue;
    text-align: center;
    border-radius: 0 0 5px 0;
    color: #0068B7;
    font-weight: 700;
}

.travel_person .travel_photo {
    display: inline-block;
    width: 120px;
    height: 130px;
    margin-top: 3px;
    /* background-color: red; */
}

.travel_photo img {
    height: 130px;
    margin-left: 12px;
    vertical-align: middle;
}

.travel_person .travel_pname {
    display: inline-block;
    width: 110px;
    height: 100px;
    /* background-color: purple; */
    vertical-align: middle;
}

.travel_pname text {
    display: block;
    /* color: #0068B7; */
}
</style>