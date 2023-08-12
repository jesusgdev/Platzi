function subscriptionTypeBenefits(subscriptionType) {
    let subscription = {
        Free: 'You can only take free courses.',
        Basic: 'You can take the full courses available for a month.',
        Expert: 'You can take the full courses available for a year.',
        ExpertDuo: 'You and someone else can take the full courses available for a year.'
    }

    if (subscription[subscriptionType]) {
        console.log(subscription[subscriptionType]);
        return;
    }

    console.warn("The subscription chosen doesn't exist, please try again");
}


