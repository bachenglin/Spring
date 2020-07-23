$(function(){
  $.ajax({
    type: 'get',
    url: 'http://localhost:8080/rest-demo/rest/products/viewall',
    dataType: 'json',
    jsonp: "jsoncallback", 
    success: function(data) {
    	//System.out.println(data);
    	$(".id0").append(data[0].id);
    	$(".name0").append(data[0].name);
    	$(".price0").append(data[0].price);
    }
  });
})