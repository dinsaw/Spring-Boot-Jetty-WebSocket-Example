var ws = new WebSocket("ws://" + location.host + "/ws/random");


ws.onopen = function() {
    var newDiv = document.createElement("div");
    newDiv.innerHTML = "WebSocket Opened";

    var holder = document.getElementById("holder");
    holder.appendChild(newDiv);
}

ws.onmessage = function(evt) {
    var newDiv = document.createElement("div");
    newDiv.innerHTML = "> " + evt.data;

    var holder = document.getElementById("holder");
    holder.appendChild(newDiv);
}

ws.onclose = function() {
    var newDiv = document.createElement("div");
    newDiv.innerHTML = "WebSocked Closed. Refresh page to open new WebSocket.";

    var holder = document.getElementById("holder");
    holder.appendChild(newDiv);
}

ws.onerror = function() {
    var newDiv = document.createElement("div");
    newDiv.innerHTML = "WebSocked Error. Try refreshing the page.";

    var holder = document.getElementById("holder");
    holder.appendChild(newDiv);
}