//index.js
//获取应用实例
const app = getApp()

Page({
  data: {
    
  },
  onLoad: function () {
    
  },
  startGujia:function(e){
    let cbGurl = e.detail.value.cbgUrl;
    wx.request({
      url:"http://localhost:8080/calc",
      header:{
        'content-type': 'application/json' // 默认值
      },
      success(res){
        console.log(res);
      }
    })
    console.log();
  }
})
