function createData() {
    $.ajax({
        type: "POST",
        url: "http://localhost:8080/rest-demo/rest/products/create",
        contentType: "application/json", 
        dataType: "json", 
        data: JSON.stringify({ 'id': $("input#id0").val(), 'name': $("input#name0").val(), 'price': $("input#price0").val()}), //data: "{'str1':'foovalue', 'str2':'barvalue'}",
        success: function (jsonResult) {
            alert(jsonResult);
        }
    });
}