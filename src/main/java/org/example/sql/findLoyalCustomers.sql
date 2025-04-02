-- LV4. 단골 고객님 찾기

-- 1. 고객별로 주문 건수와 총 주문 금액을 조회하는 SQL 쿼리를 작성해주세요.
select CustomerName,
       count(o.OrderID) as OrderCount,
       coalesce(sum(TotalAmount),0) as TotalSpent
from Customers c
         left join Orders o on c.CustomerID = o.CustomerID
group by 1;


-- 2. 나라별로 총 주문 금액이 가장 높은 고객의 이름과 그 고객의 총 주문 금액을 조회하는 SQL 쿼리를 작성해주세요.
select Country,
       CustomerName as Top_Customer,
       sum(TotalAmount) as Top_Spent
from Customers c
join Orders o on c.CustomerID = o.CustomerID
group by Country,CustomerName
having Top_Spent = (
    select max(total)
    from (select sum(o2.TotalAmount) as total
                    from Customers c2
                             join Orders o2 on c2.CustomerID = o2.CustomerID
                    where c.Country = c2.Country
                    group by CustomerName) a
)





