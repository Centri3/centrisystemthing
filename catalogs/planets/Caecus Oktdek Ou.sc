Moon	"Ou/Caecus III I"
{
	ParentBody     "Oktdek"
	Class          "Terra"
	Mass            0.015
	Radius          1722.5
	InertiaMoment   0.3709
	Oblateness      0.0016189
	Obliquity       0.0001
	EqAscendNode    63.206
	TidalLocked     true

	AlbedoBond      0.07
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "caecus_oktdek_ou.cfg"
		SurfStyle       0.91721
		Randomize      (-0.719, 0.653, -0.356)
		colorDistMagn   0.040368
		colorDistFreq   198.6
		detailScale     128
		drivenDarkening 0
		seaLevel        0.099237
		snowLevel       2
		tropicLatitude  0.029892
		icecapLatitude  2
		icecapHeight    0.021209
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.23672
		heightTempGrad  0.625
		beachWidth      0.00070135
		tropicWidth     0.07
		mainFreq        1.6652
		venusFreq       2
		venusMagn       1.5649
		mareFreq        0.3
		mareDensity     0.18321
		terraceProb     0.32775
		erosion         0
		montesMagn      0.1
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.036991
		dunesFreq       18.829
		dunesFraction   0.036239
		hillsMagn       1.5
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      55.943
		riversFreq      4.2278
		riversSin       5.7703
		riftsMagn       15
		riftsFreq       10
		riftsSin        10
		eqridgeMagn     0.068702
		eqridgeWidth    1
		eqridgeModMagn  1.4122
		eqridgeModFreq  10
		canyonsMagn     0.43841
		canyonsFreq     0.65514
		canyonsFraction 0
		cracksMagn      0.03
		cracksFreq      0.2
		cracksOctaves   15
		craterMagn      0.5
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0.35
		volcanoFreq     1.145
		volcanoDensity  0.16794
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44275
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      45
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
		PeriodDays      1.76920486
		SemiMajorAxisKm 421700
		Eccentricity    0.0001
		Inclination     0.0001
		AscendingNode   63.2061069
		ArgOfPericenter -239.083969
		MeanAnomaly     277.557252
	}
}

