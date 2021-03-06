// pages/account_summary/account_summary.js
Page({

  /**
   * Page initial data
   */
  data: {

  },

  /**
   * Lifecycle function--Called when page load
   */
  onLoad: function (options) {
    this.setData({
      cbgUrl: options.url
    })
    wx.request({
      url: 'http://localhost:8080/calcAccount?url=' + options.url,
      success:(res) =>{
        console.log(res.data);
        this.setData({
          accountView: res.data.accountView
        })
      },
      complete(){
        wx.hideLoading()
      }
    })
    wx.showLoading({
      title: '获取数据中，请耐心等待',
    })
  },

  /**
   * Lifecycle function--Called when page is initially rendered
   */
  onReady: function () {

  },

  /**
   * Lifecycle function--Called when page show
   */
  onShow: function () {

  },

  /**
   * Lifecycle function--Called when page hide
   */
  onHide: function () {

  },

  /**
   * Lifecycle function--Called when page unload
   */
  onUnload: function () {

  },

  /**
   * Page event handler function--Called when user drop down
   */
  onPullDownRefresh: function () {

  },

  /**
   * Called when page reach bottom
   */
  onReachBottom: function () {

  },

  /**
   * Called when user click on the top right corner to share
   */
  onShareAppMessage: function () {

  }
})