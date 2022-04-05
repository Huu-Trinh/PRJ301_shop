/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */

$('#addCartShop').on('show.bs.modal', function (event) {
  var button = $(event.relatedTarget) 
  var pname = button.data('name') 
  var price = button.data('price') 
  var measure = button.data('measure') 
  var quantity = button.data('quantity') 
  var pid = button.data('id') 
  var uri = button.data('uri') 
  // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
  // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
  var modal = $(this)
  modal.find('.modal-title').text('' + pname);
  modal.find('.modal-price').text('$' + price);
  modal.find('.modal-quantity').text(Math.floor(measure*quantity*1000)/1000+' kg available');
  modal.find('.modal-body .quantity').val(quantity);
  modal.find('.modal-body #quantity').val(1);
  modal.find('.modal-body .pid').val(pid);
  modal.find('.modal-body .uri').val(uri);
})
