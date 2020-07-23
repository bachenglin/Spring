var init = function() {
	var xmlHttpRequest;
	if (window.XMLHttpRequest){
		xmlHttpRequest = new XMLHttpRequest();
	} else{
		xmlHttpRequest = new ActiveXObject("Microsoft.XMLHTTP");
	}
	return xmlHttpRequest;
}

function invokeJSP() {
	console.log("Hello!");
	var userName = document.getElementById("name").value;
	console.log(userName);
	var AJAX = init();
	AJAX.open("GET", "hello.jsp?myname=" + userName, true);
	AJAX.send();
	AJAX.onreadystatechange = processRequest;
	
	//var processRequest = function() {
	function processRequest() {
		if(AJAX.readyState == 4 && AJAX.status == 200) {
			var data = AJAX.responseText;
			console.log(data);
			var divTag = document.getElementById("content");
			divTag.innerHTML = "<h3>" + data + "</h3>";
			divTag.style.backgroundColor = "yellow";
		}
	}
}