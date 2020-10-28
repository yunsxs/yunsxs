export default {
    addUserInfo(state, userInfo){
        state.userInfo = userInfo
    },
    clearUserInfo(state){
        state.userInfo = {}
    }
}