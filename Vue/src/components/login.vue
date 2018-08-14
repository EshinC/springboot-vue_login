<template>
    <div>
        <div class="login-wrap" v-show="showLogin">
            <h3>登录</h3>
            <input type="text" placeholder="请输入用户名" v-model="userInfo.username">
            <input type="password" placeholder="请输入密码" v-model="userInfo.password">
            <button @click="onSubmit">登录</button>
        </div>
    </div>
</template>
<style>
    .login-wrap{text-align:center;}
    input{display:block; width:250px; height:40px; line-height:40px; margin:0 auto; margin-bottom: 10px; outline:none; border:1px solid #888; padding:10px; box-sizing:border-box;}
    p{color:red;}
    button{display:block; width:250px; height:40px; line-height: 40px; margin:0 auto; border:none; background-color:#41b883; color:#fff; font-size:16px; margin-bottom:5px;}
    span{cursor:pointer;}
    span:hover{color:#41b883;}
    
</style>
<script>
    export default{
        data(){
            return{
                userInfo:{username:'',password:''},	
                showLogin: true,

            }
        },
        methods:{
			onSubmit(){
				// 这个是请求的url。请求的时候传递参数
				var loginUrl ='/loginController?username='+this.userInfo.username+'&password='+this.userInfo.password
				// 通过get方法请求
				this.$axios.get(loginUrl).then(response=>{
			         if (response.data=="Admin") {
			         	this.$router.push('/hello')
					 }
			      }).catch(error=>{
                      
			      })
				this.userInfo={}
			}
		}
    }
</script>