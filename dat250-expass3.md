
# Software Technology Experiment 3

In this experiment we will install MongoDB, do some simple CRUD operations, and finally use the Map-Reduce aggregation operation to add our own operation.

## MongoDB installation

Used the [Ubuntu tutorial](https://docs.mongodb.com/manual/tutorial/install-mongodb-on-ubuntu/) to install it. This adds the MongoDB public GPG-key to our trusted repository list, so we can use the apt packaging to install it.
This will verify that the download is correct for us.

## Experiment 1 - MongoDB CRUD operations

### Insert operations:
![Image of insert](https://github.com/tbordvik/dat250/raw/master/expass3/insert.png)

### Query operations:
![Image of query](https://github.com/tbordvik/dat250/raw/master/expass3/query.png)<br/>
### Update operations:
![Image of update](https://github.com/tbordvik/dat250/raw/master/expass3/update.png)<br/>
### Remove operations:
![Image of remove](https://github.com/tbordvik/dat250/raw/master/expass3/remove.png)<br/>
### Bulk-write operations:
![Image of bulk-write](https://github.com/tbordvik/dat250/raw/master/expass3/bulk-write.png)<br/>

## Experiment 2 - Aggregation

### Working example:
![Image of example-working](https://github.com/tbordvik/dat250/raw/master/expass3/example-working.png)<br/>
### Map-Reduce operation and results:
![Image of Map-Reduce operation and results](https://github.com/tbordvik/dat250/raw/master/expass3/map-reduce.png)<br/>


Just made an easy example where all the order items gets concatenated for each person, so a list of all orders per person is the output.

