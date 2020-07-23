function registerEventSourceAndAddResponseTo(uri, elementId) {
		var stringEvents = document.getElementById(elementId);
		while (stringEvents.hasChildNodes()) {
			stringEvents.removeChild(stringEvents.lastChild);
		}
		var stringEventSource = new EventSource(uri);
		stringEventSource.onmessage = function(e) {
			var newElement = document.createElement("li");
			newElement.innerHTML = e.data;
			stringEvents.appendChild(newElement);
		}
	}

	
	function registerButton() {
		addEvent("click", document.getElementById('subscribe-button'),

	function() { registerEventSourceAndAddResponseTo("/stocks/price/IBM", "display");
		     });

	}

	
	function addEvent(evnt, elem, func) {
		if (typeof (EventSource) !== "undefined") 
		{
		elem.addEventListener(evnt, func, false); 
		} 
		else { // No much to do
		          elem[evnt] = func;
		     }
		}