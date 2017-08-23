$(function () {
   console.log("load JS success")

});
function postPhone() {

    var json = $("#phoneForm").form2json();
    $.post("../phone/addw",$("#phoneForm").serialize(),function(result){
        $("span").html(result);
    },"application/json","json");

}
