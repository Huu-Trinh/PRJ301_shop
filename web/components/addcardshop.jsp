<%-- 
    Document   : addcardshop
    Created on : Apr 3, 2022, 9:16:45 AM
    Author     : HuuTrinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<form action="cart" method="post">
    <div class="modal fade" id="addCartShop" tabindex="-1" role="dialog" aria-labelledby="modalLabel" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="modalLabel"></h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <input type="hidden" name="pid" class="pid" value=""/>
                    <input type="hidden" name="uri" class="uri" value=""/>
                    <input type="hidden" name="Pquantity" class="quantity" value=""/>
                    <div class="col-12 product-details">
                        <p class="price"><span class="modal-price">$1</span></p>
                        <div class="row mt-4">
                            <div class="col-md-6">
                                <div class="form-group d-flex">
                                    <div class="select-wrap">
                                        <div class="icon"><span class="ion-ios-arrow-down"></span></div>
                                        <select name="size" id="" class="form-control">
                                            <option value="1">Small</option>
                                            <option value="2">Medium</option>
                                            <option value="3">Large</option>
                                            <option value="4">Extra Large</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="w-100"></div>
                            <div class="input-group col-md-6 d-flex mb-3">
                                <span class="input-group-btn mr-2">
                                    <button type="button" class="quantity-left-minus btn"  data-type="minus" data-field="">
                                        <i class="ion-ios-remove"></i>
                                    </button>
                                </span>
                                <input type="text" id="quantity" name="quantity" class="form-control input-number" value="1" min="1" max="100">
                                <span class="input-group-btn ml-2">
                                    <button type="button" class="quantity-right-plus btn" data-type="plus" data-field="">
                                        <i class="ion-ios-add"></i>
                                    </button>
                                </span>
                            </div>
                            <div class="w-100"></div>
                            <div class="col-md-12">
                                <p style="color: #000;" class="modal-quantity"></p>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <p><a href="javascript:"  class="btn btn-outline-danger py-3 px-5" data-dismiss="modal">Cancel</a></p>
                    <p><input type="submit" onclick="AddCard()" href="javascript:" class="btn btn-black py-3 px-5" value="Add to Cart"></p>
                </div>
            </div>
        </div>
    </div>
</form>
