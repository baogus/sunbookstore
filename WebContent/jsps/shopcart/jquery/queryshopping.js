/**
 * 
 */
$(function(){
function calcCost(){
	var books=$("td[id='xiaoji']");
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
});
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

/*$(function(){
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
	});*/

$(function(){
	//全选框
	$("#checkAll").click(function(){  
	    var a = document.getElementById("checkAll");  
	    var b = document.getElementsByName("check");  
	    if(a.checked){  
	        for(var i = 0; i < b.length; i++){  
	            b[i].checked = true;  
	        }  
	    }else{  
	        for(var i = 0; i < b.length; i++){  
	            b[i].checked = false;  
	        }  
	    }  
	})  
	//单选框  
	$("input[name='check']").click(function(){  
	    var flag = true;  
	    var a = document.getElementById("checkAll");  
	    var b = document.getElementsByName("check");  
	    for(var i = 0; i < b.length; i++){  
	        if(!b[i].checked){  
	            flag = false;  
	            break;  
	        }  
	    }  
	    a.checked = flag;  
	});  
});

$(function(){
	$("tr:even:gt(0)").css("background-color","#FFFFCC");
	$("tr:odd").css("background-color","#E2F2FF");
});