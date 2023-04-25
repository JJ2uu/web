db.getCollection("memo").find({})

db.memo.find({})

db.createUser({
    user : "winner",
    pwd : "1234",
    roles : ["readWrite", "dbAdmin"]
})
