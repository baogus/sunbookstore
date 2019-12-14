  $(function(){

            //定义鼠标悬停事件
            $(".menu li a").hover(function(){
                $(this).addClass("hover");
            },function(){
                $(this).removeClass("hover");
            });
            //定义上滑事件
            $(".title").click(function(){
                var $ul=$(this).next("ul");
                $("dd").find("ul").slideUp();
                if ($ul.is(':visible')){
                    $(this).next('ul').slideUp();
                }else{
                    $(this).next('ul').slideDown();
                }
            });
        });       