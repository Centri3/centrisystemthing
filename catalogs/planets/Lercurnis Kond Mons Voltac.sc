Moon	"Voltac/Lercurnis B IX I"
{
	ParentBody     "Mons"
	Class          "Terra"
	Mass            0.00011487
	Radius          346.61
	InertiaMoment   0.39961
	RotationOffset  70
	Obliquity       0
	EqAscendNode    -118.17
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_mons_voltac.cfg"
		SurfStyle       0.98694
		Randomize      (-0.962, 0.462, -0.155)
		colorDistMagn   0.040868
		colorDistFreq   35.681
		detailScale     128
		drivenDarkening 0.038168
		seaLevel        -0.31298
		snowLevel       2
		tropicLatitude  1
		icecapLatitude  2
		icecapHeight    0.58507
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.14855
		heightTempGrad  0.625
		beachWidth      0.00099222
		tropicWidth     0.07
		mainFreq        1.374
		venusFreq       2
		venusMagn       0.76336
		mareFreq        0.001
		mareDensity     0
		terraceProb     0.17716
		erosion         0
		montesMagn      0.03
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0
		dunesFreq       0
		dunesFraction   0
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      100
		riversFreq      10
		riversSin       10
		riftsMagn       10
		riftsFreq       3
		riftsSin        10
		eqridgeMagn     0.78626
		eqridgeWidth    0.06793
		eqridgeModMagn  0.61069
		eqridgeModFreq  3.8931
		canyonsMagn     0
		canyonsFreq     0
		canyonsFraction 0
		cracksMagn      0
		cracksFreq      15
		cracksOctaves   15
		craterMagn      0.5
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0
		volcanoFreq     0.21374
		volcanoDensity  0.14504
		volcanoOctaves  5
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   0.45802
		volcanoTemp     3000
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      25
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.86416666
		SemiMajorAxisKm 95097.5433
		Eccentricity    0.0001
		Inclination     0
		AscendingNode   -118.167939
		ArgOfPericenter -200.610687
		MeanAnomaly     -52.2137405
	}
}

