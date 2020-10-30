<template>
  <div class="checkIn_conent">
    <el-popover trigger="hover" :open-delay="200">
      <div style="width: 500px">
        <calendar :list="list"></calendar>
      </div>
      <div slot="reference" class="level_outter_title">
        <i class="el-icon-s-claim"></i>
        <span>签到查询</span>
      </div>
    </el-popover>
  </div>
</template>

<script>
import calendar from '../../../components/calendar/calendar'
export default {
  components: { calendar },
  data() {
    return {
      value: new Date(),
      list: [
        `2020-10-20`,
        `2020-10-21`,
        `2020-10-22`,
        `2020-10-23`,
        `2020-10-24`,
        `2020-10-25`,
        `2020-10-26`,
        `2020-10-26`,
        `2020-10-27`,
        `2020-10-28`,
        `2020-10-29`,
        `2020-10-30`,
      ]
    }
  }
}
</script>

<style>
.checkIn_conent {
  cursor: pointer;
}
.el-calendar-day {
  height: 20px;
}
</style>