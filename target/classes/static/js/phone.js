$(function () {
   console.log("load JS success")
    $('input').on('focus', function () {
             var target = this;
             // 使用定时器是为了让输入框上滑时更加自然
            setTimeout(function(){
                target.scrollIntoView(true);
                target.scrollIntoViewIfNeeded();
                  },300);
            });
    loadList();
    loadLogList();
});
function searchEnter(){
    if (event.keyCode==13) {
        var type = $("#input").val();
        console.log(type)
    };

}
function postPhone() {

    checkForm();

}
function checkForm(){
    // var inputs= $("#phoneForm").getElementsByTagName("INPUT");
    // for(var   i=0;   i<inputs .length;   i++)   {
    //     if(inputs[i].value==""||inputs[i].value==null)   {
    //         alert("信息不能为空!");
    //         inputs[i].focus();
    //         return (false);
    //     }
    // }

    phoneForm();
}
function phoneForm(){
    var json = $("#phoneForm").form2json();
    $.post("../phone/addw",$("#phoneForm").serialize(),function(result){
        alert(result);
    },"application/json","json");
}

function postPhoneLog() {

    checkLogForm();

}
function checkLogForm(){
    // var inputs= $("#phoneForm").getElementsByTagName("INPUT");
    // for(var   i=0;   i<inputs .length;   i++)   {
    //     if(inputs[i].value==""||inputs[i].value==null)   {
    //         alert("信息不能为空!");
    //         inputs[i].focus();
    //         return (false);
    //     }
    // }

    phoneLogForm();
}
function phoneLogForm(){
    var json = $("#phoneLogForm").form2json();
    $.post("../phone/log/addw",$("#phoneLogForm").serialize(),function(result){
        alert(result);
    },"application/json","json");
}

function loadList() {
    $("#list").empty();
    $.post("../phone/list",function(result){
        console.log(result);
        if (result.code==200){
            list = result.data.list;
            var html = "";
            for(var i in list){
                html+='<div class="item" ><span>'+list[i].phoneName+'</span><span>'+list[i].phoneColor+'</span><span>'+list[i].phoneSize+' GB</span><button data-json=\''+JSON.stringify(list[i])+'\' onclick="addLog(this)">添加记录</button></div>';
               // alert(list[i])
            }
            $("#list").append(html);
        }else{
            console.log(result.message)
        }
    },"application/json","json");

}

function loadLogList() {
    $("#logList").empty();
    $.post("../phone/log/list",function(result){
        console.log(result);
        if (result.code==200){
            list = result.data.list;
            var html = "";
            for(var i in list){
                html+='<div class="item" ><span>'+list[i].price+'</span><span>'+list[i].inPrice+'</span><span>'+list[i].version+' GB</span><button data-json=\''+JSON.stringify(list[i])+'\' onclick="sold(this)">sold one</button></div>';
                // alert(list[i])
            }
            $("#logList").append(html);
        }else{
            console.log(result.message)
        }
    },"application/json","json");

}
function addLog(data) {
    var phone = JSON.parse(data.getAttribute("data-json"));
    console.log(phone.id)
    $("#phoneId").text(" "+phone.phoneName+" "+phone.phoneColor +" "+ phone.phoneSize)
    $("[name='phoneId']").val(phone.id);
}
