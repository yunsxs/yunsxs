<template>
    <div class="list">
        <ul>
            <li v-for="(item, index) in news" :key="index">
              <a href="#">
                  <div class="List_Title"><span>{{item.title}}</span></div>
                  <span>{{item.time}}</span>
              </a>
            </li>
        </ul>
    </div>
</template>
<script>
export default {
    props:{
        news:{
            type: Array, // 新闻的数据
            default: () => {
                return [];
            }
        }
    }
    
}
</script>
<style>
.list{width:100%}
.list ul{margin: 0px;padding-left: 25px;}
.list li{
    height: 30px;
}
.list li a{
    text-decoration: none;
    color: black;
    line-height: 30px;
}
.list li a>span{float: right;color: rgba(0,0,0,0.8);}
.list li a:hover{text-decoration: red;color: red;}
.List_Title{
    width: 80%;
    height: 100%;
    float: left;
    overflow: hidden;
    text-overflow:ellipsis;
    white-space: nowrap;
}
</style>