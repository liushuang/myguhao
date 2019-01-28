//index.js
//获取应用实例
const app = getApp()

Page({
  data: {
    cbgUrl:''
  },
  onLoad: function () {
    
  },
  changeCbgUrl:function(e){
    this.setData({
      cbgUrl:e.detail.value
    });
  },
  startGujia:function(e){
    let cbgUrl = encodeURIComponent(this.data.cbgUrl);
    wx.navigateTo({
      url: "../account_summary/account_summary?url=" + cbgUrl
    });
    // wx.request({
    //   url: "http://localhost:8080/calcAccount?url=" + encodeURIComponent(cbgUrl),
    //   header:{
    //     'content-type': 'application/json' // 默认值
    //   },
    //   success(res){
    //     console.log(res);
    //   }
    // })
  }
})
