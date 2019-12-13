/**
 * 
 */
function calcCost(){
	var books=$("input[name='checkBook']");
	var cost=0;
	for(var i=0;i<books.length;i++){
		if(books[i].checked){
			var jsonString=localStorage.getItem(books[i].value);
			var jsonValue=JSON.parse(jsonString);
			cost+=jsonValue.amount*jsonValue.price;
		}
	}
	$("#sum").html("￥:"+cost+"元");
}
function shopCar(){
	var tbody=document.getElementById("shopcar");
	var jsonStrings=[];
	for(var i=0;i<localStorage.length;i++){
		var key=localStorage.key(i);
		if (key.startsWith("shopcar")) {
		  jsonStrings.push({"key":key,"value":localStorage.getItem(key)}); }
	}
	for(let i=0;i<jsonStrings.length;i++){
		var jsonValue=JSON.parse(jsonStrings[i].value);
		var row=tbody.insertRow(i);
		row.insertCell(0).innerHTML="<input type='checkbox' name='checkProduct' value='"+jsonStrings[i].key+"' onchange='calcuCost()'/>";
		row.insertCell(1).innerHTML="<img src='"+jsonValue.img+"' width='50px' height='50'/>";
		row.insertCell(2).innerHTML=jsonValue.name;
		row.insertCell(3).innerHTML=jsonValue.price;
		row.insertCell(4).innerHTML="<input type='number' name='number' min='1' max='10' value='"+jsonValue.amount+"' onchange='amountChange(this)'/>"
		row.insertCell(5).innerHTML="<button name='delete' onclick='deleteTr(this)'>删除</button>";
	}
	calcCost();
}

function amountChange(node){
	 var currentIndex=node.parentNode.parentNode.rowIndex;
	 var tbody=document.getElementById("shopcar");
	 var key=tbody.rows[currentIndex-1].cells[0].firstChild.value;
	 var jsonString=localStorage.getItem(key);
	 var jsonValue=JSON.parse(jsonString);
	 jsonValue.amount=node.value;
	 localStorage.setItem(key,JSON.stringify(jsonValue));
	 calcCost();
}
function deleteTr(node){
	 var currentIndex=node.parentNode.parentNode.rowIndex;
	 var tbody=document.getElementById("shopcar");
	 var key=tbody.rows[currentIndex-1].cells[0].firstChild.value;
	 localStorage.removeItem(key);
	 tbody.deleteRow(currentIndex-1);
	 calcCost();
}
function action(){
	$("#clear").click(function(){
		localStorage.clear();
		var tbody=document.getElementsByTagName("table")[0];
		tbody.removeChild(document.getElementById("shopcar"));
	});
}
$(function(){
	shopCar();
	action();
});