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
		row.insertCell(0).innerHTML="<input type='checkbox' name='checkBook' value='"+jsonStrings[i].key+"' onchange='calcCost()'/>";
		row.insertCell(1).innerHTML="<img src='"+jsonValue.img+"' width='50px' height='50px'/>";
		row.insertCell(2).innerHTML=jsonValue.name;
		row.insertCell(3).innerHTML=jsonValue.price;
		row.insertCell(4).innerHTML="<input type='number' name='number' min='1' max='10' value='"+jsonValue.amount+"' onchange='amountChange(this)'/>";
		row.insertCell(5).innerHTML=jsonValue.Discount;
		row.insertCell(6).innerHTML=jsonValue.price*vjsonValue.Discount;
		row.insertCell(7).innerHTML="<button name='delete' onclick='deleteTr(this)'>删除</button>";
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

/*$(function(){    
    var t = $("#quantity");    
    $("#add").click(function(){    
        t.val(parseInt(t.val())+1);    
        $("#min").removeAttr("disabled");                 //当按加1时，解除$("#min")不可读状态    
        setTotal();    
    })    
    $("#min").click(function(){    
               if (parseInt(t.val())>1) {                     //判断数量值大于1时才可以减少    
                t.val(parseInt(t.val())-1)    
                }else{    
                $("#min").attr("disabled","disabled")        //当$("#min")为1时，$("#min")不可读状态    
               }    
        setTotal();    
    })    
    function setTotal(){    
        $("#total").html((parseInt(t.val())*3.95).toFixed(2));    
    }    
    setTotal();    
}) ;*/

$(function(){
	         $(".add").click(function(){
	         var t=$(this).parent().find('input[class*=text_box]');
	         t.val(parseInt(t.val())+1)
	         setTotal();
	     })
	     $(".min").click(function(){
	         var t=$(this).parent().find('input[class*=text_box]');
	         if (parseInt(t.val())>1) {
	         t.val(parseInt(t.val())-1)
	         if(parseInt(t.val())<0){
	        	 t.val(0);
	         	}
	         	setTotal();
	         }
	     })
	     function setTotal(){
	         var s=0;
	         $("#tab td").each(function(){
	         s+=parseInt($(this).find('input[class*=text_box]').val())*parseFloat($(this).find('span[class*=price]').text());
	     });
	         $("#total").html(s.toFixed(2));
	     }
	     setTotal();
	 
	     });

$(function(){
		$("#checkAll").click(function(){
			$("input[type='checkbox']:gt(0)").prop("checked",this.checked);
		});
		$("input[type='checkbox']:gt(0)").click(function(){
			var checkArr = $("input[type='checkbox']:gt(0)").map(function(){return $(this)}).get();
			var result = false;
			for(var i=0;i<checkArr.length;i++){
				if(!checkArr[i]){
					result = true;
				}
			}
			if(result){
				$("#checkAll").prop("checked",true);
			}else{
				$("#checkAll").prop("checked",false);
			}
			
		});  
	});

$(function(){
	$("tr:even:gt(0)").css("background-color","#FFFFCC");
	$("tr:odd").css("background-color","#E2F2FF");
});