$( "#login-submit" ).click(function() {
//teacherEmployeeNo
  console.log("AAAAAAAAABBBBBBBBBBBBCCCCCCCCCCCC")
  var tEmployeeNo = $('#login-submit').val();
  tEmployeeNo = tEmployeeNo.split('/').join('-');
  if(tEmployeeNo==""){alert("To Search By Teacher Employee No, Please Enter the Teacher Employee No First");
  }else{
  console.log( "searchByEmployeeNo Handler for .click() called." +tEmployeeNo);
  window.location.href = "../../teacher/by-teacher-employeeNo/"+tEmployeeNo;
  }
});