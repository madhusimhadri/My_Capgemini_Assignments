import React, {useState} from 'react'
import userList from './CRUD/Data'
import AddUserForm from './Forms/AddUserForm'
import UserTable from './Table/UserTable'
import EditUserForm from './Forms/EditUserForm'
function App() {

    const [users, setUsers] = useState(userList);
    const deleteUser = (id) => setUsers(users.filter(user => user.id !==id));
    const addUser = (user) =>
    {
        user.id = users.length + 1;
        setUsers([...users,user]);
    }
    
    const [editing, setEditing] = useState(false);
    const initialUser = {id: null, name: '', username: ''};
    const [currentUser, setCurrentUser] = useState(initialUser);


    const editUser = (id, user) => {
        setEditing(true);
        setCurrentUser(user);
      }
      const updateUser = (newUser) => {
        setUsers(users.map(user => (user.id === currentUser.id ? newUser : user)))
      }
    return (
        <div className="container">
        <h1>Crud operations in React</h1>
        <div className="row">
          <div className="five columns">
            { editing ? (
              <div>
                <h2>Edit user</h2>
                <EditUserForm 
                  currentUser={currentUser}
                  setEditing={setEditing}
                  updateUser={updateUser}
                />
              </div>
            ) : (
              <div>
                <h2>Add user</h2>
                <AddUserForm addUser={addUser} />
              </div>
            )}
          </div>
          <div className="seven columns">
            <h2>View users</h2>
            <UserTable users={users} deleteUser={deleteUser} editUser={editUser} />
          </div>
        </div>
      </div>
    )
}

export default App
