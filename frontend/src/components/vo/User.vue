<template>
    <div>
        <v-card-title  v-if="editMode">
            {{label}}
        </v-card-title>
        <v-card-title  v-if="!editMode">
            Your Profile
            <v-col
                cols="12"
                sm="3"
            >
                <v-btn
                v-if="avatarMode"
                icon
                color="primary"
                @click="changeUserCard()"
                >
                    <v-icon>mdi-credit-card</v-icon>
                </v-btn>
                <v-btn
                v-if="!avatarMode"
                icon
                color="primary"
                @click="changeUserCard()"
                >
                    <v-icon>mdi-account-box</v-icon>
                </v-btn>
            </v-col>
        </v-card-title>

        <v-card-text v-if="value">
            <div v-if="editMode">
                <v-text-field label="아이디" v-model="value.userId"/>
            </div>
            <div v-if="editMode">
                <v-text-field label="비밀번호" v-model="value.password"/>
            </div>
            <div v-if="editMode">
                <v-text-field label="이름" v-model="value.name"/>
            </div>
            <div v-if="editMode">
                <v-text-field label="이메일" v-model="value.email"/>
            </div>
            <div v-if="editMode">
                <v-text-field label="주소" v-model="value.address"/>
            </div>
            <div v-if="editMode">
                <v-text-field label="휴대폰" v-model="value.phone"/>
            </div>
            <div v-if="!editMode">
                <v-card
                    v-if="!editMode && avatarMode"
                    class="mx-auto"
                    max-width="200"
                    height="200"
                    style="margin-bottom:10px;"
                >
                    <v-row
                        align="center"
                        class="fill-height"
                    >
                        <v-col class="py-0">
                            <v-avatar width="120" height="120" color="white" style="margin: 15px 0 -5px 40px;">
                                <v-img
                                    :src="value.profileImg ? value.profileImg:'https://user-images.githubusercontent.com/92732781/174538537-631a0ee2-40bb-4589-a58b-67da0ef17e38.png'"
                                    class="mx-auto"
                                ></v-img>
                            </v-avatar>
                            <v-list-item
                                color="rgba(0, 0, 0, .4)"
                            >
                                <v-list-item-content>
                                    <v-list-item-title class="text-h6" align="center">
                                        {{value.name }}
                                    </v-list-item-title>
                                </v-list-item-content>
                            </v-list-item>
                        </v-col>
                    </v-row>
                </v-card>
                <v-card
                    v-if="!editMode && !avatarMode"
                    class="mx-auto"
                    max-width="400"
                    style="margin-bottom:10px;"
                >
                    <v-row
                        align="end"
                        class="fill-height"
                    >
                        <v-col
                        align-self="start"
                        class="pa-0"
                        cols="12"
                        >
                        </v-col>
                        <v-col class="py-0">
                        <v-avatar color="white" style="margin: 15px 0 -5px 15px;">
                            <v-img
                                :src="value.profileImg ? value.profileImg:'https://user-images.githubusercontent.com/92732781/174538537-631a0ee2-40bb-4589-a58b-67da0ef17e38.png'"
                                class="mx-auto"
                            ></v-img>
                        </v-avatar>
                        <v-list-item
                            color="rgba(0, 0, 0, .4)"
                        >
                            <v-list-item-content>
                                <v-list-item-title class="text-h6">
                                    
                                </v-list-item-title>
                                <v-list-item-subtitle style="font-weight:500;">
                                    Id :  {{value.userId }}<br>
                                    Password :  {{value.password }}<br>
                                    Email :  {{value.email }}<br>
                                    Address :  {{value.address }}<br>
                                    Phone :  {{value.phone }}
                                </v-list-item-subtitle>
                            </v-list-item-content>
                        </v-list-item>
                        </v-col>
                    </v-row>
                </v-card>
            </div>
        </v-card-text>
    </div>
</template>

<script>
    export default {
        name:"User",
        props: {
            editMode: Boolean,
            value : Object,
            label : String, 
        },
        data: () => ({
            avatarMode : false,
        }),
        created(){
            if(!this.value) {
                this.value = {
                    'userId': '',
                    'password': '',
                    'name': '',
                    'email': '',
                    'address': '',
                    'phone': '',
                };
            }
        },
        watch: {
            value(newVal) {
                this.$emit('input', newVal);
            },
        },
        methods: {
            changeUserCard() {
                this.avatarMode = !this.avatarMode;
            }
        }
    }
</script>

<style scoped>
</style>