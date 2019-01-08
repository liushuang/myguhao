var system = require('system');
var page = require('webpage').create();
page.settings.userAgent = 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.99 Safari/537.36';
var url = system.args[1];

page.open(url, function (s) {
  setTimeout(function(){
            var descValue = page.evaluate(function(){
            	return document.getElementById('equip_desc_value').innerHTML;
            }); 
            console.log(descValue);
            phantom.exit();
      },3000)
});