<template>
  <el-calendar>
    <template slot="dateCell" slot-scope="{ date, data }">
      <div class="duge" :class="{ duge_bg: list.indexOf(data.day) != -1 }">
        <p :class="data.isSelected ? 'is-selected' : ''">
          {{ data.day.split('-').slice(1)[1] }}
        </p>
      </div>
    </template>
  </el-calendar>
</template>
<script>
export default {
  props: {
    list: {
      type: Array,
      default: () => {
        return []
      }
    }
  },
  data() {
    return {}
  }
}
</script>
<style>
.el-calendar {
  /* width: 100%; */
  /* height: 500px; */
}
.el-calendar__title {
  margin: 0px;
  width: 100%;
  height: 100%;
  display: flex;
  align-items: center;
  justify-content: center;
  font-size: 25px;
  background-color: rgb(87, 87, 124);
  color: white;
  padding: 0px;
}
.el-calendar__body {
  padding: 0px;
  margin: 0px;
}
.el-calendar__header {
  height: 20%;
  padding: 0px;
  margin: 0px;
}
.el-calendar__button-group {
  display: none;
}
.el-calendar-table thead {
  background-color: rgb(87, 87, 124);
  font-size: 20px !important;
  text-align: center;
}
.el-calendar-table thead th {
  color: white !important;
}
.duge_bg {
  background-color: rgb(54, 113, 231);
  color: white;
}
.duge {
  width: 50px;
  height: 50px;
  border-radius: 50%;
  line-height: 50px;
  text-align: center;
}
.el-calendar-day {
  display: flex;
  font-size: 20px;
  height: 58px !important;
  justify-content: space-around;
  align-items: center;
}
</style>