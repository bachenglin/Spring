for $x in doc("Books.xml")/books/book
return if($x/@category="XML") then <XMLBOOK>{data($x/title)}</XMLBOOK>
else <NONXML> {data($x/title)}</NONXML>