function updateData() {
    $.ajax({
        type: "POST",
        url: "http://localhost:8080/rest-demo/rest/products/update",
        contentType: "application/json", 
        dataType: "json", 
        data: JSON.stringify({ 'id': $("input#id1").val(), 'name': $("input#name1").val(), 'price': $("input#price1").val()}), //data: "{'str1':'foovalue', 'str2':'barvalue'}",
        success: function (jsonResult) {
            alert("Success");
        }
    });
}