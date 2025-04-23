SELECT p.product_id,
        ROUND(IFNULL(sum(u.units*p.price)/sum(u.units),0),2)As average_price
        FROM Prices p Left Join UnitsSold u on p.product_id=u.product_id AND u.purchase_date Between p.start_date and p.end_date
        Group By p.product_id

