DwarfPlanet	"Mou/Caecus I.FT1"
{
	ParentBody     "Caecus system bar"
	Class          "Ferria"
	Mass            0.00024604
	Radius          336.01
	InertiaMoment   0.39966
	Obliquity       0.74809
	EqAscendNode    -35.725
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Interior
	{
		Composition
		{
			Metals		100
		}
	}

	Surface
	{
		Preset         "caecus_kou_ft_mou.cfg"
		SurfStyle       0.96129
		Randomize      (-0.183, -0.955, 0.931)
		colorDistMagn   0.061175
		colorDistFreq   41.542
		detailScale     128
		drivenDarkening 0
		seaLevel        0.21205
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  0.77863
		icecapHeight    0.031564
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.20392
		heightTempGrad  0.625
		beachWidth      0.00068671
		tropicWidth     0.061069
		mainFreq        1.8959
		venusFreq       0.73367
		venusMagn       0
		mareFreq        0.5
		mareDensity     1
		terraceProb     0.19141
		erosion         0
		montesMagn      0.01
		montesFreq      12.166
		montesSpiky     0.95704
		montesFraction  0.053135
		dunesMagn       0.028092
		dunesFreq       3.6015
		dunesFraction   0.94596
		hillsMagn       0.05
		hillsFreq       38.64
		hillsFraction   0.23926
		hills2Fraction  0
		riversMagn      63.203
		riversFreq      2.5515
		riversSin       6.4866
		riftsMagn       9.1603
		riftsFreq       3.2689
		riftsSin        7.4274
		canyonsMagn     0.72815
		canyonsFreq     0.10113
		canyonsFraction 0.2313
		cracksMagn      0.058961
		cracksFreq      0.099646
		cracksOctaves   0
		craterMagn      0.5
		craterFreq      5
		craterDensity   1
		craterOctaves   16
		craterRayedFactor 0
		volcanoMagn     0.20171
		volcanoFreq     0.67486
		volcanoDensity  0.25981
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.17334
		volcanoRadius   0.16464
		volcanoTemp     1105.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      15
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
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
		Period          2.72897324
		SemiMajorAxis   1.6000001
		Eccentricity    0.0458015267
		Inclination     0.7480916
		AscendingNode   -35.7251908
		ArgOfPericenter -57.7099237
		MeanAnomaly     -60
	}
}

