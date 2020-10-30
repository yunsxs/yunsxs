<template>
  <div class="government">
    <div class="gover_swiper">
      <el-carousel height="400px">
        <el-carousel-item v-for="item in swiper" :key="item">
          <el-image
            style="width: 100%; height: 100%"
            :src="item"
            fit="fill"
          ></el-image>
        </el-carousel-item>
      </el-carousel>
    </div>
    <div class="gover_swiper2">
      <el-carousel height="100px" direction="vertical">
        <el-carousel-item v-for="item in topImg" :key="item">
          <el-image
            style="width: 100%; height: 100%"
            :src="item"
            fit="fill"
          ></el-image>
        </el-carousel-item>
      </el-carousel>
      <div class="newList">
        <div class="newtap"><span>政务资讯</span></div>
        <hr />
        <List :news="news"></List>
      </div>
    </div>
  </div>
</template>
<script>
import List from '../../../components/list/list'
export default {
  components: {
    List
  },
  data() {
    return {
      news: [
        { title: '就如何做好下一阶段改革工作，展开会议', time: '2020-10-30' },
        {
          title: '省政协农业和农村委副主任邹英香一行到修水调研',
          time: '2020-10-30'
        },
        {
          title: '市人大常委会副主任李小林一行到我县专题调研',
          time: '2020-10-30'
        },
        { title: '吴炎弘到对口联系企业走访调研', time: '2020-10-30' },
        {
          title: '县人大开展城区市政设施建设与管护情况调研',
          time: '2020-10-29'
        },
        { title: '省军区到我县开展民兵调整改革验收考评', time: '2020-10-29' },
        {
          title: '厉害了！祈福工艺获江西省第三届文旅产业“金杜鹃”奖',
          time: '2020-10-29'
        }
      ],
      topImg: [
        require('../../../assets/imgs/h1.jpg'),
        require('../../../assets/imgs/h2.jpg'),
        require('../../../assets/imgs/h3.jpg')
      ],
      swiper: [
        require('../../../assets/imgs/home1.jpg'),
        require('../../../assets/imgs/home2.jpg'),
        require('../../../assets/imgs/home3.jpg'),
        require('../../../assets/imgs/home4.jpg')
      ]
    }
  }
}
</script>
<style>
.government {
  width: 100%;
  margin-bottom: 50px;
}
.government > div {
  float: left;
}
.gover_swiper {
  width: 40%;
}
.gover_swiper2 {
  width: 58%;
  margin-left: 2%;
}
.newtap {
  width: 150px;
  height: 40px;
  font-size: 20px;
  font-weight: bold;
  color: white;
  text-align: center;
  line-height: 40px;
  margin: 10px 0px;
  background: url('../../../assets/imgs/title.png') no-repeat;
  background-size: 100% 100%;
}
</style>