
# Software Technology Experiment 2

## Inspecting the database

I am using Linux.
Utilizing the java package org.apache.derby.tools.ij, by going to the /bin directory
of the derby installation folder and running ```/.ij``` gives us a terminal that can connect
to derby databases. Connected using the same string as in persistence.xml:
```connect 'jdbc:derby:/path/to/db_name';```
Used ```show tables;``` and ```describe test.table_name;``` for each table name.

## Experiment 1

[Link to code](https://github.com/tbordvik/dat250/tree/master/software-experiment-2/exp1)

    Family
    COLUMN_NAME         |TYPE_NAME|DEC&|NUM&|COLUM&|COLUMN_DEF|CHAR_OCTE&|IS_NULL&
    --------------------|---------|----|----|------|----------|----------|--------
    ID                  |INTEGER  |0   |10  |10    |NULL      |NULL      |NO      
    DESCRIPTION         |VARCHAR  |NULL|NULL|255   |NULL      |510       |YES     

---

    Job
    COLUMN_NAME         |TYPE_NAME|DEC&|NUM&|COLUM&|COLUMN_DEF|CHAR_OCTE&|IS_NULL&
    ------------------------------------------------------------------------------
    ID                  |INTEGER  |0   |10  |10    |NULL      |NULL      |NO      
    JOBDESCR            |VARCHAR  |NULL|NULL|255   |NULL      |510       |YES     
    SALERY              |DOUBLE   |NULL|2   |52    |NULL      |NULL      |YES     

---

    Person
    COLUMN_NAME         |TYPE_NAME|DEC&|NUM&|COLUM&|COLUMN_DEF|CHAR_OCTE&|IS_NULL&
    ------------------------------------------------------------------------------
    ID                  |VARCHAR  |NULL|NULL|255   |NULL      |510       |NO      
    FIRSTNAME           |VARCHAR  |NULL|NULL|255   |NULL      |510       |YES     
    LASTNAME            |VARCHAR  |NULL|NULL|255   |NULL      |510       |YES     
    NONSENSEFIELD       |VARCHAR  |NULL|NULL|255   |NULL      |510       |YES     
    FAMILY_ID           |INTEGER  |0   |10  |10    |NULL      |NULL      |YES     

---

    Person_Job
    COLUMN_NAME         |TYPE_NAME|DEC&|NUM&|COLUM&|COLUMN_DEF|CHAR_OCTE&|IS_NULL&
    ------------------------------------------------------------------------------
    PERSON_ID           |VARCHAR  |NULL|NULL|255   |NULL      |510       |NO      
    JOBLIST_ID          |INTEGER  |0   |10  |10    |NULL      |NULL      |NO      

---

    Sequence
    COLUMN_NAME         |TYPE_NAME|DEC&|NUM&|COLUM&|COLUMN_DEF|CHAR_OCTE&|IS_NULL&
    ------------------------------------------------------------------------------
    SEQ_NAME            |VARCHAR  |NULL|NULL|50    |NULL      |100       |NO      
    SEQ_COUNT           |DECIMAL  |0   |10  |15    |NULL      |NULL      |YES     

I would not expect that the Nonsensefield would be created in the database since it is
annotated as transient. Not sure why the Sequence table is generated either, since we specify
the GenerationType.TABLE on the ID's. Everything else looks OK to me.

## Experiment 2

[Link to Code](https://github.com/tbordvik/dat250/tree/master/software-experiment-2/exp2)
    Address

    COLUMN_NAME         |TYPE_NAME|DEC&|NUM&|COLUM&|COLUMN_DEF|CHAR_OCTE&|IS_NULL&
    --------------------|---------|----|----|------|----------|----------|--------
    ID                  |BIGINT   |0   |10  |19    |GENERATED&|NULL      |NO      
    NUMBER              |INTEGER  |0   |10  |10    |NULL      |NULL      |YES     
    STREET              |VARCHAR  |NULL|NULL|255   |NULL      |510       |YES     

---

    Bank

    COLUMN_NAME         |TYPE_NAME|DEC&|NUM&|COLUM&|COLUMN_DEF|CHAR_OCTE&|IS_NULL&
    --------------------|---------|----|----|------|----------|----------|--------
    ID                  |BIGINT   |0   |10  |19    |NULL      |NULL      |NO      
    NAME                |VARCHAR  |NULL|NULL|255   |NULL      |510       |YES     

---

    Bank_CreditCard

    COLUMN_NAME         |TYPE_NAME|DEC&|NUM&|COLUM&|COLUMN_DEF|CHAR_OCTE&|IS_NULL&
    --------------------|---------|----|----|------|----------|----------|---------
    BANK_ID             |BIGINT   |0   |10  |19    |NULL      |NULL      |NO      
    CREDITCARDS_NUMBER  |INTEGER  |0   |10  |10    |NULL      |NULL      |NO   

---

    CreditCard

    COLUMN_NAME         |TYPE_NAME|DEC&|NUM&|COLUM&|COLUMN_DEF|CHAR_OCTE&|IS_NULL&
    --------------------|---------|----|----|------|----------|----------|---------
    NUMBER              |INTEGER  |0   |10  |10    |NULL      |NULL      |NO      
    BALANCE             |INTEGER  |0   |10  |10    |NULL      |NULL      |YES     
    LIMIT               |INTEGER  |0   |10  |10    |NULL      |NULL      |YES     
    COUNT               |INTEGER  |0   |10  |10    |NULL      |NULL      |YES     
    PINCODE             |VARCHAR  |NULL|NULL|255   |NULL      |510       |YES     
    BANK_ID             |BIGINT   |0   |10  |19    |NULL      |NULL      |YES     

---

    Person

    COLUMN_NAME         |TYPE_NAME|DEC&|NUM&|COLUM&|COLUMN_DEF|CHAR_OCTE&|IS_NULL&
    --------------------|---------|----|----|------|----------|----------|---------
    ID                  |BIGINT   |0   |10  |19    |GENERATED&|NULL      |NO      
    NAME                |VARCHAR  |NULL|NULL|255   |NULL      |510       |YES     

---

    Person_Address

    COLUMN_NAME         |TYPE_NAME|DEC&|NUM&|COLUM&|COLUMN_DEF|CHAR_OCTE&|IS_NULL&
    --------------------|---------|----|----|------|----------|----------|---------
    PERSON_ID           |BIGINT   |0   |10  |19    |NULL      |NULL      |NO      
    ADDRESSES_ID        |BIGINT   |0   |10  |19    |NULL      |NULL      |NO      

---

    Person_CreditCards

    COLUMN_NAME         |TYPE_NAME|DEC&|NUM&|COLUM&|COLUMN_DEF|CHAR_OCTE&|IS_NULL&
    --------------------|---------|----|----|------|----------|----------|--------
    PERSON_ID           |BIGINT   |0   |10  |19    |NULL      |NULL      |NO      
    CREDITCARDS_NUMBER  |INTEGER  |0   |10  |10    |NULL      |NULL      |NO      

---

    Sequence

    COLUMN_NAME         |TYPE_NAME|DEC&|NUM&|COLUM&|COLUMN_DEF|CHAR_OCTE&|IS_NULL&
    --------------------|---------|----|----|------|----------|----------|--------
    SEQ_NAME            |VARCHAR  |NULL|NULL|50    |NULL      |100       |NO      
    SEQ_COUNT           |DECIMAL  |0   |10  |15    |NULL      |NULL      |YES     

- Address, Bank and Person are created with an ID field as bigInt, 
which is represented by a Long in the Entity - as expected.
- For the CreditCard entity I used the number field as ID and embedded the Pincode
class, since we don't need an extra table for the pincode.
- The Bank_Creditcard table links creditcards to banks, but I don't think it's necessesary. It would be enough to have the bank_id field in the CreditCard table, and do a join with Bank. I tried to set the mappedBy property of creditCards in the Bank entity to the bank field in the CreditCard entity, with no effect.
- Person_Address and Person_CreditCards is Many-to-Many, so these tables are fine.
- Sequence table created since we use the GenerationType.AUTO for the ID fields, and for Derby this is GenerationType.SEQUENCE (for integers at least).

## Other issuses

- When connected to the database with the ij tool, I could not connect to the database with the main application.
  In combination with this, when writing exit in the ij tool, it just closes the whole terminal window you already had up. Urgh.
