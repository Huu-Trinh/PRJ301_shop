/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */

$('#addCartShop').on('show.bs.modal', function (event) {
  var button = $(event.relatedTarget) // Button that triggered the modal
  var pname = button.data('name') // Extract info from data-* attributes
  var price = button.data('price') // Extract info from data-* attributes
  var quantity = button.data('measure') // Extract info from data-* attributes
  // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
  // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
  var modal = $(this)
  modal.find('.modal-title').text('' + pname);
  modal.find('.modal-price').text('$' + price);
  modal.find('.modal-quantity').text(Math.floor(quantity*1000)/1000+' kg available');
  modal.find('.modal-body input').val(1);
})
