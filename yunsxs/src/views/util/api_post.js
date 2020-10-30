import axios from 'axios';

axios.defaults.baseURL = 'http://localhost:8081/yunsxs_api/api/'

/**
 * 向action表中添加数据
 * 
 * @param {int} userid 用户id
 * @param {int} rule_id 积分规则id
 */
export async function addScore(userid, rule_id) {
    const { data: res } = await axios.post('action/insert', {
        userid,
        rule_id
    });
    return res
}

// 获取积分列表
export function getActionInfo(userId) {
    return axios.get('action/get', {
        params: {
            userId
        }
    })
}

// 更改user表中的score
export async function updateUserScore(userId, userLevel, userScore, score) {
    userScore += score
    console.log(userLevel, userScore)
    switch (userLevel) {
        case 1:
            userScore > 300 ? userLevel++ : userLevel
            break
        case 2:
            userScore > 800 ? userLevel++ : userLevel
            break
        case 3:
            userScore > 1500 ? userLevel++ : userLevel
            break
        case 4:
            userScore > 2500 ? userLevel++ : userLevel
            break
    }
    const { data: res } = await axios('user/updateScore', {
        params: {
            userId,
            score,
            userLevel
        }
    })
    return res
}