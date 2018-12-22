<template>
    <div id="dashboard">
        <ul class="collection with-header">
            <li class="collection-header"><h4>Employees</h4></li>
            <li class="collection-item" v-for="employee in employees" v-bind:key="employee.employee_id">{{employee.employee_name}}</li>
        </ul>
        <div class="fixed-action-btn">
            <router-link to="/new" class="btn-floating btn-large red">
                <i class="fa fa-plus"></i>
            </router-link>
        </div>
    </div>
</template>


<script>
import db from './firebaseInit'
export default {
  name: 'dashboard',
  data(){
      return{
          employee: []

      }
  },
  created() {
      db.collection('employees').get().then(querySnapshot => {
          querySnapshot.forEach(doc => {
              console.log(doc.data());
              const data = {
                'id': doc.id,
                'employee_id': doc.data().employee_id,
                'employee_name': doc.data().employee_name,
                'employee_age': doc.data().employee_age,
                'employee_dept': doc.data().employee_dept,
                'employee_position': doc.data().employee_position,  
              }
              this.employee.push(data);
          })
      })
  }
}
</script>