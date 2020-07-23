function deleteData() {
    $.ajax({
        type: "POST",
        url: "http://localhost:8080/rest-demo/rest/products/delete/"+$("input#id2").val(),
        contentType: "application/json", 
        dataType: "json", 
        success: function (jsonResult) {
            alert("success");
        }
    });
}