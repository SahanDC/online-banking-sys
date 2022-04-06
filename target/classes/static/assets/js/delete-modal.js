$('#exampleModal').on('show.bs.modal', function (event) {
  var button = $(event.relatedTarget) // Button that triggered the modal
  console.log(button);
  var recipient = button.data('whatever')
  var urlDel = button.data('linkd')// Extract info from data-* attributes
  var modal = $(this)
  modal.find('.modal-title').text('Deleting ' + recipient.replace("%20"," "))
  modal.find('#modalDelButton').attr("href", urlDel);

})



$('#inoutModal').on('show.bs.modal', function (event) {
  var button = $(event.relatedTarget) // Button that triggered the modal
  console.log(button);
  $("#input-modal-2").hide();
  //labels
  var itemLabel = button.data('item-value-label');
  var itemLabel2 = button.data('item-value-label2');
  var modalTitle = button.data('title-msg');
  var urlAdd = button.data('linkd')// Extract info from data-* attributes
  var modal = $(this)
  modal.find('.modal-title').text('Updating ' + modalTitle)
  modal.find('#main-label-id').text(itemLabel)
  if(itemLabel2 != null){
     $("#input-modal-2").show();
  }
  modal.find('#main-label-id2').text(itemLabel2)
  modal.find('#url-to-call').val(urlAdd)

})



$('#modalAddButton').on(
'click',
function(evt)
{
    console.log('triggered');
    var urlCall = $("#url-to-call").val();
    var stock = $("#modal-new-number").val();
    if(urlCall.includes("/sale/forStudent/")){
          var productCount = $("#modal-new-number2").val();
          window.location = urlCall + "/" + stock + "/" + productCount;
      }
      else
      {
          window.location = urlCall + "/" + stock;
      }

}
);