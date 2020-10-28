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
                <div class="mask"></div>
                <div class="big">
                    <img src="../images/bg02.jpg" alt="" class="bigImg">
                </div>
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
                <div class="travel_big">
                    <img src="../images/bg03.jpg" alt="">
                    <div class="mask1"></div>
                    <div class="big1">
                        <img src="../images/bg03.jpg" alt="" class="bigImg1">
                    </div>
                </div>
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
                <div class="travel_big1">
                    <img src="../images/bg04.jpg" alt="">
                    <div class="mask2"></div>
                    <div class="big2">
                        <img src="../images/bg04.jpg" alt="" class="bigImg2">
                    </div>
                </div>
            </div>
            <div class="travel_text">
                <h2>千年古镇</h2>
                <a href="#">渣津镇，商周时期开始建城，古称艾侯国，是古艾文化策源地 、佛教文化发祥地、中共苏区根据地。渣津是宗教圣地。早在晋代有吴猛和许逊，炼丹于黄龙山及龙安山， 为民除害，追赶孽龙，留有许多故事传说。</a>
            </div>
        </div>
    </div>
</template>

<script>
window.addEventListener('load', function(){
    var travel_pic = document.querySelector('.travel_pic');
    var mask = document.querySelector('.mask');
    var big = document.querySelector('.big');
    travel_pic.addEventListener('mouseover', function(){
        mask.style.display = 'block';
        big.style.display = 'block';
    })
    travel_pic.addEventListener('mouseout', function(){
        mask.style.display = 'none';
        big.style.display = 'none';
    })
    travel_pic.addEventListener('mousemove', function(e){
        var x = e.pageX - this.offsetLeft;
        var y = e.pageY - this.offsetTop;
        var maskX = x - 202;
        var maskY = y - 315;

        var maskMaxX = travel_pic.offsetWidth - mask.offsetWidth;
        var maskMaxY = travel_pic.offsetHeight - mask.offsetHeight;

        if(maskX <= 0) {
            maskX = 0
        } else if(maskX >= maskMaxX) {
            maskX = 260;
        }
        if(maskY <= 0) {
            maskY = 0
        } else if(maskY >= maskMaxY) {
            maskY = 80;
        }
        mask.style.left = maskX + 'px';
        mask.style.top = maskY + 'px';
        var bigImg = document.querySelector('.bigImg');
        var bigMaxX = bigImg.offsetWidth - big.offsetWidth;
        var bigMaxY = bigImg.offsetHeight - big.offsetHeight;
        var bigX = maskX * bigMaxX / maskMaxX;
        var bigY = maskY * bigMaxY / maskMaxY;
        bigImg.style.left = -bigX + 'px';
        bigImg.style.top = -bigY + 'px';
    })

    var travel_big = document.querySelector('.travel_big');
    var mask1 = document.querySelector('.mask1');
    var big1 = document.querySelector('.big1');
    travel_big.addEventListener('mouseover', function(){
        mask1.style.display = 'block';
        big1.style.display = 'block';
    })
    travel_big.addEventListener('mouseout', function(){
        mask1.style.display = 'none';
        big1.style.display = 'none';
    })
    travel_big.addEventListener('mousemove', function(e){
        var x = e.pageX - 1058;
        var y = e.pageY - 475;
        var maskX1 = x ;
        var maskY1 = y ;

        var maskMaxX1 = travel_pic.offsetWidth - mask1.offsetWidth;
        var maskMaxY1 = travel_pic.offsetHeight - mask1.offsetHeight;

        if(maskX1 <= 0) {
            maskX1 = 0
        } else if(maskX1 >= maskMaxX1) {
            maskX1 = 260;
        }
        if(maskY1 <= 0) {
            maskY1 = 0
        } else if(maskY1 >= maskMaxY1) {
            maskY1 = 80;
        }
        mask1.style.left = maskX1 + 'px';
        mask1.style.top = maskY1 + 'px';
        var bigImg1 = document.querySelector('.bigImg1');
        var bigMaxX1 = bigImg1.offsetWidth - big1.offsetWidth;
        var bigMaxY1 = bigImg1.offsetHeight - big1.offsetHeight;
        var bigX1 = maskX1 * bigMaxX1 / maskMaxX1;
        var bigY1 = maskY1 * bigMaxY1 / maskMaxY1;
        bigImg1.style.left = -bigX1 + 'px';
        bigImg1.style.top = -bigY1 + 'px';
    })

    var travel_big1 = document.querySelector('.travel_big1');
    var mask2 = document.querySelector('.mask2');
    var big2 = document.querySelector('.big2');
    travel_big1.addEventListener('mouseover', function(){
        mask2.style.display = 'block';
        big2.style.display = 'block';
    })
    travel_big1.addEventListener('mouseout', function(){
        mask2.style.display = 'none';
        big2.style.display = 'none';
    })
    travel_big1.addEventListener('mousemove', function(e){
        var x = e.pageX - this.offsetLeft;
        var y = e.pageY - this.offsetTop;
        var maskX2 = x - 503;
        var maskY2 = y - 635;

        var maskMaxX2 = travel_pic.offsetWidth - mask2.offsetWidth;
        var maskMaxY2 = travel_pic.offsetHeight - mask2.offsetHeight;

        if(maskX2 <= 0) {
            maskX2 = 0
        } else if(maskX2 >= maskMaxX2) {
            maskX2 = 260;
        }
        if(maskY2 <= 0) {
            maskY2 = 0
        } else if(maskY2 >= maskMaxY2) {
            maskY2 = 80;
        }
        mask2.style.left = maskX2 + 'px';
        mask2.style.top = maskY2 + 'px';
        var bigImg2 = document.querySelector('.bigImg2');
        var bigMaxX2 = bigImg2.offsetWidth - big2.offsetWidth;
        var bigMaxY2 = bigImg2.offsetHeight - big2.offsetHeight;
        var bigX2 = maskX2 * bigMaxX2 / maskMaxX2;
        var bigY2 = maskY2 * bigMaxY2 / maskMaxY2;
        bigImg2.style.left = -bigX2 + 'px';
        bigImg2.style.top = -bigY2 + 'px';
    })
})
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
    position: relative;
    display: inline-block;
    width: 340px;
    height: 160px;
}

.travel_pic img {
    width: 340px;
    height: 160px;
}

.mask {
    display: none;
    position: absolute;
    top: 0;
    left: 0;
    width: 80px;
    height: 80px;
    background-color: #FEDE4F;
    opacity: .5;
    border: 1px solid #ccc;
    cursor: move;
}

.big {
    display: none;
    position: absolute;
    left: 340px;
    top: 0;
    width: 250px;
    height: 250px;
    background-color: #fff;
    z-index: 999;
    border: 1px solid #ccc;
    overflow: hidden;
}

.big img {
    position: absolute;
    top: 0;
    left: 0;
    width: 820px;
    height: 512px;
}

.mask1 {
    display: none;
    position: absolute;
    top: 0;
    left: 0;
    width: 80px;
    height: 80px;
    background-color: #FEDE4F;
    opacity: .5;
    border: 1px solid #ccc;
    cursor: move;
    z-index: 999;
}

.big1 {
    display: none;
    position: absolute;
    left: -252px;
    top: 0;
    width: 250px;
    height: 250px;
    background-color: #fff;
    z-index: 999;
    border: 1px solid #ccc;
    overflow: hidden;
}

.big1 img {
    position: absolute;
    top: 0;
    left: 0;
    width: 1080px;
    height: 719px;
}

.mask2 {
    display: none;
    position: absolute;
    top: 0;
    left: 0;
    width: 80px;
    height: 80px;
    background-color: #FEDE4F;
    opacity: .5;
    border: 1px solid #ccc;
    cursor: move;
}

.big2 {
    display: none;
    position: absolute;
    left: 340px;
    top: 0;
    width: 250px;
    height: 250px;
    background-color: #fff;
    z-index: 999;
    border: 1px solid #ccc;
    overflow: hidden;
}

.big2 img {
    position: absolute;
    top: 0;
    left: 0;
    width: 1280px;
    height: 853px;
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